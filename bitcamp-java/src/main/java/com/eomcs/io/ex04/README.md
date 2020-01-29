O/S -> Device 제어 API 정한다.
              /- Driver

H/W -> Device Driver API
              /- 구현 (.lib .. ) - H/W를 제어하는 함수
              
         data
H/W  <----------> App

   data는 byte 흐름.
      ---------->
             read
      <----------
      write  

I/O Streaming     