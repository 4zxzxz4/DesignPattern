package BuilderPattern;

public class Client {

	public static void main(String[] args) {
		// 책제목, 지은이, 퍼블리셔, 쪽수, 가격 순으로 넣으면 괜찮다
		PlainBook plainBook = new PlainBook("CISCONetworking", "진강훈", "성인당", 476, 25000);
		System.out.println(plainBook);

		// 그런데 넣는 순서를 헷갈린다면?
		// 책제목이 퍼블리셔로, 쪽수를 가격으로 넣을 수도 있는 모순이 생길 수 있다.
		PlainBook missMatchePlainBook = new PlainBook("성인당", "진강훈", "CISCONetworking", 25000, 476);
		System.out.println(missMatchePlainBook);

		// 위와 같은 상황을 타개하기 위해 다음 방법을 쓴다
		// JavaBean Pattern (자바빈 패턴)
		// 각 변수를 getter, setter로 접근하여 설정한다.
		// 생성자 signature에 의존했던 위의 방법과 달리 setter로 마음대로 설정할 수 있다
		AdvancedBookOne advancedBookOne = new AdvancedBookOne();
		advancedBookOne.setPages(476);
		advancedBookOne.setName("진강훈");
		advancedBookOne.setAuthor("CISCONetworking");
		advancedBookOne.setPrice(25000);
		advancedBookOne.setPublisher("성인당");
		System.out.println(advancedBookOne);

		// 만약 객체를 생성할 때 생성자에 들어갈 인자가 아직 정해지지 않았다면?
		// 아래와 같은 경우는 책 제목이 아직 정해지지 않아 책제목 인수만 빈문자열을 넘기지만, 만약 생성자의 변수가 50씩이나 되고
		// 아직 정해지지 않는 값들이 그 중 30개 이상이 된다면? 하나씩 인수의 기본값을 설정해야 주어야할까?
		// PlainBook nonePublisherBook = new PlainBook("", "진강훈", "성인당", 476, 25000);
		// 아니면 생성자의 signature를 무시하고 인수를 아예 넣지 않아 컴파일 에러가 생기는 경우도 있을 것이다
		// PlainBook nonePublisherBook = new PlainBook(, "진강훈", "성인당", 476, 25000);
		// 위의 같은 상황에 대처하기 위해 다음 방법을 쓴다
		// Telescoping Contructor Pattern (점층적 생성자 패턴)
		AdvancedBookTwo advancedBookTwo = new AdvancedBookTwo();
		System.out.println(advancedBookTwo);

		// 생성자를 신경쓰지 않고, 데이터의 순서 상관 없이, 직관적으로 이해할 수 있는 객체를 만들 수 있을까?
		// BuilderPattern은 이에 부합하는 패턴이다
		BuilderPatternBook builderPatternBook = new BuilderPatternBook().setAuthor("진강홍").setPages(476).build();
		System.out.println(builderPatternBook);
		
		AdvancedBuilderPatternBook advancedBuilderPatternBook = new AdvancedBuilderPatternBook
				.Builder("CISCONetworking", 20000).setAuthor("진강훈").setPages(476).setPublisher("성인당").build();
		System.out.println(advancedBuilderPatternBook);
		
		try {
			AdvancedBuilderPatternBook wrongAdvancedBuilderPatternBook = new AdvancedBuilderPatternBook
					.Builder("CISCONetworking", 20000).setAuthor("진강훈").setPages(0).setPublisher("성인당").build();
			System.out.println(wrongAdvancedBuilderPatternBook);
		} catch (IllegalStateException e) {
			e.printStackTrace();
			System.out.println("페이지가 0페이지 혹은 퍼블리셔가 2글자 이하에 대한 핸들링");
		}
	}

}
