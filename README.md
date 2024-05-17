# 송예진 202330117

## 5월 17일
컨테이너와 배치, 배치관리자 개념

배치 관리자 대표 유형 4가지
<h5>FlowLayout</h5>

- 컴포턴트과 삽입되는 순서대로 왼쪽으서 오른쪽으로 배치
- 배치할 공간이 없으면 아래로 내려와서 반복  
<h5>BorderLayout</h5>

- 컴테이너의 공간을 동, 서, 남, 북, 중앙의 5개 영역으로 나눔
- 5개 영역 중 응용프로그램에서 지정한 영역에 컴포넌트 배치
- add() 메소드: comp 컴포턴트를 index 위치에 삽입/ index: 컴포넌트의 위치  
<h5>GridLayout</h5>

- 컨테이너를 프로그램에서 설정한 동일한 크기의 2차원 격자로 나눔
- 컴포넌트는 삽입 순서대로 좌에서 우로, 다시 위에서 아래로 배치  
- 생성자: GridLayout(),GridLayout(int rows, int cols),GridLayout(int rows, int cols, int hGap, int vGap)  
<h5>CardLayout</h5>

- 컨테이너의 공간에 카드를 쌓아 놓은 듯이 컴포넌트를 포개어 배치  

<h5>컨테이너의 디폴트 배치관리자</h5>

- 컨테이너 생성시 자동으로 생성되는 배치관리자   

<h5>배치관리자가 없는 컨테이너</h5>

- 응용프로그램에서 직접 컴포넌트의 크기와 위치를 결정하고자 하는 경우
 1. 컴포넌트의 크기나 위치를 개발자 임으로 결정하고자 하는 경우
 2. 게임 프로그램과 같이 시간이나 마우스/키보드의 입력에 따라 컴포넌트들의 위치와 크기가 수시로 변하는 경우
 3. 여러 컴포넌트들이 서로 겹쳐 출력하고자 하는 경우
 - containersetLayout(null);  

<h5>배치관리자가 없는 컨테이너</h5>

- 배치관리자가 없는 컨테이너에 컴포넌트를 삽입할 때
1. 프로그램에서 컴포넌트의 절대 크기와 위치 설정
2. 컴포넌트들이 서로 겹치게 할 수 있음

## 5월 3일
컬렉션 자바 인터페이스와 클래스
벡터의 특성
- &lt E &gt 에 사용할 요소의 특정 타입으로 구체화
- 배열을 가진 크기로 다룰 수 있게 하는 컨테이너
- 요소 객체들을 삽입, 삭제, 검색하는 컨테이너
  
ArrayList &lt E &gt
- 가변 크기 배열을 구현한 클래스
- 벡터와 거의 동일
  
HasgMap &lt K, v &gt
- 키와 값의 쌍으로 구성되는 요소를 다루는 컬렉션
- 삽입 및 검색이 빠른 특징
  
GUI 응용프로그램  
AWT와 SWING 패키지
  
컨테이너
- 다른 컴포넌트를 포함할 수 있는 GUI 컴포넌트
- 다른 컨테이너에 포함될 수 있음
  
컴포넌트
- 컨테이너에 포함되어야 화면에 출력될 수 있는 GUI 객체
- 다른 컴포넌트를 포함할 수 없는 순수 컨테이너

## 4월 19일
추상 클래스(abstract) 상속  
- 추상 클래스를 상속받으면 추상 클래스가 됨
  
추상 클래스 구현
  
추상 클래스의 목적
- 상속을 위한 슈퍼 클래스로 활용하는 것
- 서브 클래스에서 추상 메소드 구현
- 다형성 실현
  
자바의 인터페이스
- 클래스가 구현해야 할 메소드들이 선언되는 추상형
- 인터페이스선언 키워드로 선언 

자바 인터페이스에 대한 변화  
자바7까지  
- 인터페이스는 상수와 추상 메소드로만 구성
  
- 여전히 인터페이스에는 필드(멤버변수) 선언 불가
  
인터페이스의 구성요소들
- 상수, 추상 메소드, default 메소드, private 메소드, static
  
인터페이스 상속
- 인터페이스 간에 상속 가능
- 인터페이스 다중 상속 허용

- *오버라이딩*, *오버로딩*

<h3> 6장 </h3>
6장 1,2,3은 많이 사용 중  
패키지 개념과 필요성
-  합칠 때 오류 발생 감소
  
패키지
- 서로 관련된 클래스와 인터페이스를 컴파일한 클래스 파일들을 묵어 놓은 디렉터리
- 하나의 응용프로그램은 한 개 이상의 패키지로 작성
- 패키지는 jar 파일로 압축할 수 있음
  
모듈
- 여러 패키지와 이미지 등의 자원을 모아 놓은 컨테이너
- 하나의 모듈을 하나의 .jmod 파일에 저장  
자바9부터 모듈화 도입
- 플랫폼의 모듈화
- 응용프로그램의 모듈화
  
모듈화의 목적
- 자바9부터 자바api를 여러 모듈(99개)로 분할
- 응용프로그램이 실행할 때 꼭 필요한 모듈들로만 실행환경 구축
  
모듈의 현실
- 자바9부터 전면적으로 도입
- 복잡한 개념
- 큰 자바 응용프로그램에는 개발, 유지보수 등에 적합
- 현실적으로 모듈로 나누어 자바 프로그램을 작성할 필요 없음
  
자바JDK에 제공되는 모듈 파일들
- 자바가 설치된 jmods 디렉터리에 모듈 파일 존재
- 모듈 파일에는 자바API의 패키지와 클래스들이 들어 있음
  
패키지 사용하기, import문
- 다른 패키지에 작성된 클래스 사용(import 사용x)<-이렇게 사용안함
- 필요한 클래스만 iport(import java.util.Scanner;)
- 패키지 전체를 import(import java.util.*;)
  
클래스 파일이 저장되는 위치
- 패키지로 선언된 디렉터리에 저장
  
패키지 선언
- 소스 파일의 맨 앞에 컴파일 후 저장될 패키지 지정
  
java projects > java2-1-1 > src + > package > package 이름(java2.add)
java2.add + > class > class 이름(Add.java)
  
자바 모듈화이 목적
- 자바 컴포넌트들을 필요에 따라 조립하여 사용하기 위함
- 컴퓨터 시스템의 불필요한 부담 감소
  
모든 자바 클래스는 반드시 object를 상속받도록 자동 컴파일

객체 비교(==)와 equals() 메소드
  
박싱, 언박싱  
박싱: 기본 타입이 값을wrapper 객체로 변환
언박싱: 박싱의 반대 wrapper 객체에 들어 있는 기본 타입의 값을 빼내는 것
  
스트링 리터럴과 new String()
스트링 리터럴
- 자바 가상 기계 내부에서 리터럴 테이블에 저장되고 관리됨
- 응용프로그램에서 공유됨

new String()으로 생성된 스트링
- 스트링 객체는 힙에 생성
- 스트링은 공유되지 않음
  
Math클래스
- 기본 산술 연산 메소드를 제공하는 클래스
- 모든 메소드는 static으로 선언

<h3> 시험 범위 6장까지
패키지와 모듈 개념 이해, 사용자 패키지 만들기, 자바에서 제공하는 표준 패키지

- 수요일 시험 시간 50분, 코드완성 or 채워넣기, 오류 수정
- 오픈북, 인터넷 사용 가능!
  

## 4월 12일
static 멤버 사용
- 클래스 이름으로 접근 가능
- 객체의 멤버로 접근 가능
- non-static 멤버는 클래스 이름으로 접근 안 됨  
전역 변수와 전역 함수를 만들 때 사용  
공유 멤버를 만들 때 사용  
static 메소드의 제약 조건
- static 메소드는 오직 static 멤버만 접근 가능
- static 메소드는 this 사용불가<h6>(static메소드는 객체상관없이 사용가능) 
  
final 클래스와 메소드
- final 클래스 더이상 클래스 상속(오버라이딩) 불가능
  
final 필드, 상수선언
- 상수를 선언할 때 사용
- 상수 필드는 선언 시 에 초기값 지정
- 실행 줄 값 변경할 수 없다.
  
클래스 상속과 객체
1. 상속 선언
- extends 키워드로 선언(부모 클래스를 물려받아 확장한다는 의미)
- 부모 클래스 -> 슈퍼클래스(super class)
- 자식 클래스 -> 서브 클래스(sub class)
  
슈퍼 클래스의 멤버에 대한 서브 클래스의 접근
- 슈퍼 클래스의 private 멤버(서브 클래스에서 접근 불가)
- 슈퍼 클래스의 default 멤버(서브 클래스가 동일한 페키지 있을 때 접근가능)
- 슈퍼 클래스의 public 멤버
- 슈퍼 클래스의 protected 멤버
  
protected 멤버에 대한 접근
- 같은 패키지의 모든 클래스 허용
- 상속되는 서브 클래스에게 허용(같은 패키지든 다른 패키지든 상관없이)
  
생성자: 객체 초기화시켜줌  
초기화 시킬 것이 없으면 생성자 없어도 됨  
하지만 내부적으로 오류있음  
기본 생성자: 매개변수 없음  

- 슈퍼 클래스와 서브 클래스 각각 여러 개의 생성자 작성 가능
- 서브 클래스의 객체가 생성될 때 슈퍼 클래스 생성자 1개와 서브 클래스 생성자 1개 실행
- 서브 클래스의 생성자아 슈퍼클래스의 생성자가 결정되는 방식
 - 1. 개발자의 명시적 선택
 - 2. 컴파일러가 기본생성자 선택
  
업캐스팅 개념
- 서브 클래스의 레퍼런스를 슈퍼 클래스 레퍼런스에 대입
- 슈퍼 클래스 레퍼런스로 서브 클래스 객체를 가르키게 되는 현상
- 슈퍼 클래스 레퍼런스로 객체 내의 슈퍼 클래스의 멤버만 접근 가능
  
다운캐스팅
- 슈퍼 클래스 레퍼런스를 서브 클래스 레퍼런스에 대입
- 업캐스팅된 것을 다시 원래대로 되돌리는 것
- 반드시 명시적 타입 변환 지정
  
업캐스팅된 레퍼런스로는 객체이 실제 타입을 구분하기 어려움  
-슈퍼클래스는 여러 서브 클래스에 상속되기 때문
  
instanceof 연산자
- 레퍼런스가 가리키는 객체의 타입 식별

메소드 오버라이딩
- 서브 클래스에서 슈퍼 클래스의 메소드 중
  
정적 바인딩 동적 바인딩

추상 메소드
추상 클래스

  
## 4월 5일
2차원 배열  
자바 상속
- 상위 클래스의 멤버를 하위 클래스가 물려받음
- 상위 클래스: 수퍼 클래스  

소프트웨어의 생산성 향상
- 컴퓨터 산업 발전에 따라 소프트웨어의 생명 주기 단축
- 객체 지향 언어 

실세계에 대한 쉬운 모델링
- 초기 프로그래밍
- 현대 프로그래밍
- 객체 지향 언어

절차 지향 프로그래밍
- 작업 순서를 표현하는 컴퓨터 명령 집합
- 함수들의 집합으로 프로그램 작성

객체 지향 프로그래밍
- 컴퓨터가 수행하는 작업을 객체들간의 상호작용으로 표현
- 클래스 혹은 객체들의 집합으로 프로그램 작성

생성자의 특징
- 생성자 이름은 클래스 이름과 동일
- 생성자는 여러 개 작성 가능(생성자 중복)
- 생성자는 객체 생성시 한 번만 호출

객체 소멸
- new에 의해 할당 받은 객체와 배열 메모리를 자바 가상 기계로 되돌려 주는 행위
- 소멸된 객체 공간은 가용 메모리에 포함

자바에서 사용자 임의로 객체 소멸안됨
- 자바는 객체 소멸 연산자 없음
- 객체 소멸은 자바 가상 기계의 고유한 역할
- 자바 개발자에게는 매우 다행스러운 기능

가비지
- 가리키는 레퍼런스가 하나도 없는 객체
가비지 컬렉션
- 자바 가상 기계의 가비지 컬렉터가 자동으로 가비지 수집, 반환

클래스 접근지정



## 3월 29일 강의
- Scanner를 이용한 키 입력  
- 개발자가 원하는 타입 값으로 쉽게 읽을 수 있음  
- 산술연산자(+, -, *, /, %)  
- 조건 연산(3 개의 피연산자로 구성된 삼항(ternary)연산자)  

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