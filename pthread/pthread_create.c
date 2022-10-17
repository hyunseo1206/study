
int pthread_create(pthread_t * restrict thread, 	//스레드의 식별자
		const pthread_attr_t *restrict attr, 	//설정할 스레드 속성정보(NULL 입력시 기본설정 적용)
		void *(*start_routine)(void *), 	//스레드가 실행할 함수
		void *restrict arg 			//스레드가 실행할 함수에 들어갈 인자
		); 
    
/*    
>>매개변수에 대한 설명<<
pthread_t *restrict thread
스레드의 식별자
    
const pthread_attr_t *restrict attr
설정할 스레드 속성정보(NULL 입력시 기본설정 적용)
    
void *(*start_routine)(void *)
스레드가 실행할 함수
    
void *restrict arg
스레드가 실행할 함수에 들어갈 인자
*/
