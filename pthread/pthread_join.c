
int pthread_join(pthread_t thread, void **retval);

int pthread_join(스레드의 식별자, 스레드에 할당된 함수 실행 후 종료 상태);

/*
pthread_t thread
스레드의 식별자

void **retval
스레드에 할당된 함수 실행 후 종료상태
*/
