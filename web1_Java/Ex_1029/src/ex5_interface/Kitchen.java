package ex5_interface;

public class Kitchen implements Menu3 {
//Menu1, Menu2 ,Menu3�ε� Menu3�� ���߻����
//�������̽��� ���� ������ ����
	
	//Menu1
	@Override
	public String jjajang() {
		return "�߸� + ����ҽ�";
	}
	@Override
	public String jjambbong() {
		return "ȫ�� + ��¡��";
	}
	
	
	//Menu2
	@Override
	public String tangsuyuck() {
		return "������� + ������ �ҽ�";
	}
	
	
	//Menu3
	@Override
	public String boggembab() {
		return "��õ�� + ������ä";
	}

}
