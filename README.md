# DesignPattern

### CompositePattern
1. CompositePattern으로 무엇을 해결 할 수 있는가?
- 클라이언트가 부분(part)-전체(whole) 객체를 통일되게 다룰 수 있도록 부분 전체 계층이 표현되어야 할 때.
- 부분-전체 계층이 트리 구조로 표현되어야 할 때.

2. CompositePattern를 사용하려면?
- 부분과 전체 객체를 위한 통일된 컴포넌트 인페이스가 정의되어야 한다.
- 개별적 단일(leaf) 객체들은 컴포넌트 인터페이스를 직접적으로 구현하고, 복합(composite) 객체들은 요청을 그들의 자식 컴포넌트들에게 요청한다.

3. 이 패턴이 나온 이유?
- 트리 구조를 다룰 때, 노드와 브랜치를 동일한 방법으로 다루고 싶을 때가 있어서.

### AdapterPattern
1. AdapterPattern이 필요할때?
- 외부의 인터페이스를 내부의 인터페이스에 맞춰 사용하려 할 때.
- Target(Internal) << Adapter << Adaptee(External)

2. Adapter 이름은 보통 어떻게 짓나?
- Adapter의 명명규칙은 대부분 [Adaptee-ClassName]To[Target-ClassName]Adapter 로 짓는다.

3. AdapterPattern은 Class Adapter와 Object Adapter로 나뉜다는데?
- Class Adapter는 Multiple inheritance 방식, Object Adapter는 Composition 방식으로 구현한다.

4. Adapter VS Decorator VS Facade VS Proxy 의 차이점?
- Adapter Pattern은 인터페이스를 감싸서 호출을 위임(delegation)한다.
- Decorator Pattern은 객체를 감싼 동작을 구현한다.
- Facade Pattern은 하나 이상의 인퍼페이스를 감싸고 사용하기 쉬운 중앙 집중화된 인터페이스를 제공한다.
- Proxy Pattern은 주체(Subject)를 감싸고 호출을 위임한다.