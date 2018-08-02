package BuilderPattern;

public class Client {

	public static void main(String[] args) {
		// å����, ������, �ۺ���, �ʼ�, ���� ������ ������ ������
		PlainBook plainBook = new PlainBook("CISCONetworking", "������", "���δ�", 476, 25000);
		System.out.println(plainBook);

		// �׷��� �ִ� ������ �򰥸��ٸ�?
		// å������ �ۺ��ŷ�, �ʼ��� �������� ���� ���� �ִ� ����� ���� �� �ִ�.
		PlainBook missMatchePlainBook = new PlainBook("���δ�", "������", "CISCONetworking", 25000, 476);
		System.out.println(missMatchePlainBook);

		// ���� ���� ��Ȳ�� Ÿ���ϱ� ���� ���� ����� ����
		// JavaBean Pattern (�ڹٺ� ����)
		// �� ������ getter, setter�� �����Ͽ� �����Ѵ�.
		// ������ signature�� �����ߴ� ���� ����� �޸� setter�� ������� ������ �� �ִ�
		AdvancedBookOne advancedBookOne = new AdvancedBookOne();
		advancedBookOne.setPages(476);
		advancedBookOne.setName("������");
		advancedBookOne.setAuthor("CISCONetworking");
		advancedBookOne.setPrice(25000);
		advancedBookOne.setPublisher("���δ�");
		System.out.println(advancedBookOne);

		// ���� ��ü�� ������ �� �����ڿ� �� ���ڰ� ���� �������� �ʾҴٸ�?
		// �Ʒ��� ���� ���� å ������ ���� �������� �ʾ� å���� �μ��� ���ڿ��� �ѱ�����, ���� �������� ������ 50���̳� �ǰ�
		// ���� �������� �ʴ� ������ �� �� 30�� �̻��� �ȴٸ�? �ϳ��� �μ��� �⺻���� �����ؾ� �־���ұ�?
		// PlainBook nonePublisherBook = new PlainBook("", "������", "���δ�", 476, 25000);
		// �ƴϸ� �������� signature�� �����ϰ� �μ��� �ƿ� ���� �ʾ� ������ ������ ����� ��쵵 ���� ���̴�
		// PlainBook nonePublisherBook = new PlainBook(, "������", "���δ�", 476, 25000);
		// ���� ���� ��Ȳ�� ��ó�ϱ� ���� ���� ����� ����
		// Telescoping Contructor Pattern (������ ������ ����)
		AdvancedBookTwo advancedBookTwo = new AdvancedBookTwo();
		System.out.println(advancedBookTwo);

		// �����ڸ� �Ű澲�� �ʰ�, �������� ���� ��� ����, ���������� ������ �� �ִ� ��ü�� ���� �� ������?
		// BuilderPattern�� �̿� �����ϴ� �����̴�
		BuilderPatternBook builderPatternBook = new BuilderPatternBook().setAuthor("����ȫ").setPages(476).build();
		System.out.println(builderPatternBook);
		
		AdvancedBuilderPatternBook advancedBuilderPatternBook = new AdvancedBuilderPatternBook
				.Builder("CISCONetworking", 20000).setAuthor("������").setPages(476).setPublisher("���δ�").build();
		System.out.println(advancedBuilderPatternBook);
		
		try {
			AdvancedBuilderPatternBook wrongAdvancedBuilderPatternBook = new AdvancedBuilderPatternBook
					.Builder("CISCONetworking", 20000).setAuthor("������").setPages(0).setPublisher("���δ�").build();
			System.out.println(wrongAdvancedBuilderPatternBook);
		} catch (IllegalStateException e) {
			e.printStackTrace();
			System.out.println("�������� 0������ Ȥ�� �ۺ��Ű� 2���� ���Ͽ� ���� �ڵ鸵");
		}
	}

}
