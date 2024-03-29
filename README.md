# 송예진 202330117

## 3월 29일 강의
-Scanner를 이용한 키 입력  
-개발자가 원하는 타입 값으로 쉽게 읽을 수 있음  
-산술연산자(+, -, *, /, %)  
-조건 연산(3 개의 피연산자로 구성된 삼항(ternary)연산자)  

- 학습목표
1. 반복문
2. continue문과 break문 활용
3. 자바의 배열 선언 및 활용
4. 배열을 리턴하는 메소드 작성
5. 예외 개념과 자바에서의 예외 처리

## 3월 22일 강의 자바의 플랫폼 독립성
WORA(Write Once Run AnuWhere)  
-한번 작성된 코드는 모든 플랫폼에서 바로 실행  
-c/c++ 등 기존 언어가 가진 플랫폼 종속성 극복  
-네트워크에 연결된 어느 클라이언트에서나 실행  
  
WORA를 가능하게 하는 자바의 특징  
-바이트코드(바이너리 코드)  
-JVM(자바 가상 기계)  

JDK와 JRE  
-JDK 자바 응용 개발 환경, 개발에 필요한 도구 포함  
-JRE 자바 실행 환경, 개발자가 아닌 경우 JRE만 따로 다운 가능  
-JDk의 bin 디렉터리에 포함된 주요 개발 도구 javac java jmod jdb javap jlink javadoc jar  

자바 응용의 종류: 서블릿 응용프로그램  
서블릿(servlet)  
-웹 서버에서 실행되는 자바 프로그램  
-데이터베이스 서버 및 기타 서버와 연동하는 복잡한 기능 구현 시 사용  
-사용자 인터페이스가 필요 없는 응용  
-웹 서버에 의해 실행 통제 받음  
안드로이드  
-구글의주도로 여러 모바일 회사가 모여 구성한 OHA에서 만든 무료 모바일 플랫폼  
-개발언어는 자바를 사용하나 jvm에 해당하는 Dalvik은 기존 바이트 코드와 호환성이 없어 변환 필요  

자바의 특성
1. 플랫폼 독립성  
-하드웨어, 운영체제에 종속되지 않는 바이트 코드로 플랫폼 독립성  
2. 객체지향  
-캡슐화, 상송, 다형성 지원
3. 클래스로 캡슐화  
-자바의 모든 변수나 함수는 클래스 내에 선언  
-클래스 안에서 클래스(내부 클래스) 작성 가능  
4. 소스(.java)와 클래스(.class) 파일  
-클래스 파일에는 하나의 클래스만 존재  
-하나의 소스 파일에 여러 클래스를 작성 가능  
-소스 파일의 이름과 public으로 선언된 클래스 이름은 같아야 함  

자바의 특징(2)
1. 실행 코드 배포
2. 패키지
3. 멀티스레드
4. 가비지 컬렉션

자바의 특징(3)
1. 실시간 응용프로그램에 부적합
2. 자바 프로그램은 안전
3. 프로그램 작성 쉬움
4. 실행 속도 개선을 위한 JIT 컴파일러 사용

문자열은 기본 타입이 아님(String 클래스로 문자열 표현)  
상수는 전부 대문자로  
var 키워드  
-java10부터 도입  
-기존의 변수 선언 방식: 변수의 타입 반드시 지정  
-타입을 생략하고 변수 선언 가능  
-컴파일러가 추론하여 변수 타입 결정  

## 3월 15일 강의
내용정리

# java2-1
개요는 리드미에 나온다