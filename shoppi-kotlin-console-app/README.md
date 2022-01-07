# 코틀린 기초 배우기 

## 컴파일
- 컴파일(Compile) : 작성한 소스코드를 프로그램을 만드는 기계어로 번역하는 과정
- 컴파일 타임 : 컴파일 시 요구되는 시간
- 컴파일 타임의 수행되는 동작 : 컴파일에 성공하기 위해 충족해야 하는 요구사항

## 런타임
- 프로그램이 실행되는 시간
- 런타임 오류 등 

## ?. : safe call operator
- nullable 타입 변수 속성에 접근 가능
- Kotlin 을 사용하면 NullPointerException 이 줄어든다? : 자바가 Nullable 타입을 따로 구분하지 않기 때문에
개발자가 따로 처리를 해주어야 한다

## ? : Elvis operator
- if 대신 사용
- ex) var username = readLine() ? : ""

## !! not-null assertion operator
- 컴파일 가능
- NullPointerException 발생 가능

## is / !is : type check operator
- 스마트 캐스트 : type 검사 이후에는 해당 type으로 자동 변환됨

## as / as? : Unsafe cast operator / Safe cast operator
