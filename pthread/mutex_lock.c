#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <pthread.h>

int ncount; // 쓰레드간 공유되는 자원 _ 글로벌 변수 (초기값 0)
pthread_mutex_t  mutex = PTHREAD_MUTEX_INITIALIZER; // 쓰레드 초기화 
 
void* do_loop(void *data) 
{ 
    int i; 
    for (i = 0; i < 10; i++) {
        pthread_mutex_lock(&mutex); // 잠금을 생성한다. 
        //임계영역 시작
        printf("loop1 : %d\n", ncount); 
        ncount ++; 
        // 임계영역 끝
        pthread_mutex_unlock(&mutex); // 잠금을 해제한다. 
        sleep(1); 
    } 
} 
 
void* do_loop2(void *data) 
{ 
    int i; 
 
    // 잠금을 얻으려고 하지만 do_loop 에서 이미 잠금을  
    // 얻었음으로 잠금이 해제될때까지 기다린다.  
    // 교행 수행 되지 않고 엇갈려서 (중첩되는 것 없이) 수행된다.
    for (i = 0; i < 10; i++) { 
        pthread_mutex_lock(&mutex); // 잠금을 생성한다. 
        printf("loop2 : %d\n", ncount); 
        ncount++;
        pthread_mutex_unlock(&mutex); // 잠금을 해제한다.
        sleep(2);
    }
} 
 
int main() 
{ 
    int thr_id; 
    pthread_t p_thread[2]; //thread 2개 실행
    int status; 
    int a = 1; 
 
    //두 thread는 약간의 시차를 두고 돌기 시작함.
    ncount = 0; 
    thr_id = pthread_create(&p_thread[0], NULL, do_loop, (void *)&a); 
    sleep(1); 
    thr_id = pthread_create(&p_thread[1], NULL, do_loop2, (void *)&a); 
 
    // 종료되기를 기다림
    pthread_join(p_thread[0], (void *) &status); //thread[0]이 종료되기를 기다림.
    pthread_join(p_thread[1], (void *) &status); //thread[1]이 종료되기를 기다림.
 
    status = pthread_mutex_destroy(&mutex); // 반납할 때만 사용 (create는 없음)
    printf("code  =  %d", status); 
    printf("programing is end"); 
    return 0; 
}
