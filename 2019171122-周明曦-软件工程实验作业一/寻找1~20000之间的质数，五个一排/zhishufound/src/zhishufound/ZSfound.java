package zhishufound;

public class ZSfound {
	public static void main(String[] args) {
		int n = 1;//��������n���ж��Ƿ���
		
		// �����Ǵ�2��ʼ�ģ������ȱ���2��20000������
		for(int i = 2; i <= 20000; i++){
			//��������j������С��i����������
			int j = 2;
			while(i % j != 0 ){
				//���i%j ������Ϊ0���� ������ֱ������Ϊ0
				j++;
			}
			//�������Ϊ0��jΪ����1֮����С���ܱ��Լ��������������ж�j�ǲ��Ǳ���
			if(i == j){
				//���j����i�����i
				
				if(n % 5 != 0){//�ж��Ƿ���
					System.out.print(i+",");//�������5�ı�������ͬ�����
					n++;
				}else{
					System.out.println(i);//�����5�ı������������
					n++;
				}
			}
		}
	}

}
