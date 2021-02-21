package team3project;
import java.util.Scanner;
public class team3Board {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        int boardNum=100;
        int boardInformation=6;
        String[][] boardArray = new String[boardNum][boardInformation];
        
        int num=0;
        String title;
        String content;
        String author;
        String pwd;
        
        String selectNo;
        boolean run=true;
        
        Scanner sc=new Scanner(System.in);
        while(run) {
           System.out.println("--------------------------------------------------------------------------------------");
           System.out.println("1.���| 2.����(Create) | 3.�б�(Read) |"
                 + " 4.����(Update) | 5.����(Delete) | 6.����");
           System.out.println("--------------------------------------------------------------------------------------");
           System.out.print("�޴�����: ");
           
           selectNo=sc.nextLine();
           
           //1.Select
           if(selectNo.equals("1")) {
             System.out.print("1.��ȣ��\t 2.��ȸ����>>");
             String order=sc.nextLine();
             
             if(order.equals("1")) {
                  //�������� ����
                  for(int i=0;i<boardNum;i++) {
                     for(int j=i+1;j<boardNum;j++) {
                        if((boardArray[i][0]==null)||(boardArray[j][0]==null)) {
                           continue;
                        }
                        int m=Integer.parseInt(boardArray[i][0]);
                        int n=Integer.parseInt(boardArray[j][0]);   
                        if(m<n) {
                           String[] temp=boardArray[i];
                           boardArray[i]=boardArray[j];
                           boardArray[j]=temp;
                        }   
                     }
                  }     
               }
             else if(order.equals("2")) {
                  for(int i=0;i<boardNum;i++) {
                      for(int j=i+1;j<boardNum;j++) {
                         if((boardArray[i][4]==null)||(boardArray[j][4]==null)) {
                            continue;
                         }
                         int m=Integer.parseInt(boardArray[i][4]);
                         int n=Integer.parseInt(boardArray[j][4]);   
                         if(m<n) {
                            String[] temp=boardArray[i];
                            boardArray[i]=boardArray[j];
                            boardArray[j]=temp;
                         } else if (m == n) {
                            if (Integer.parseInt(boardArray[i][0]) < Integer.parseInt(boardArray[j][0])) {
                                 String[] temp=boardArray[i];
                                 boardArray[i]=boardArray[j];
                                 boardArray[j]=temp; 
                            }   
                         }
                      }
                   }     
             }
              //���
              System.out.println("��ȣ\t����\t����\t�۾���\t��ȸ��");
              for(int i=0;i<boardNum;i++) {
                 if(boardArray[i][0]!=null) {
                    for(int j = 0; j < boardArray[i].length - 1; j++) {
                       System.out.print(boardArray[i][j]+"\t");
                    }
                    System.out.println();
                 }
             }
             

              
        }
           //2.Create
           else if(selectNo.equals("2")) {

              System.out.print("����:");
              title=sc.nextLine();
              while (title.equals("")) {
                 System.out.println("������ �Է����ּ���.");
                 System.out.print("����:");
                 title=sc.nextLine();
              }
                 
              
              System.out.print("����:");
              content=sc.nextLine();
              System.out.print("�۾���:");
              author=sc.nextLine();
              System.out.print("��й�ȣ:");
              pwd=sc.nextLine();
              
              boolean full=true;
              for(int i=0;i<boardNum;i++) {
                 if(boardArray[i][0]==null) {
                    boardArray[i][0]=Integer.toString(++num);
                    boardArray[i][1]=title;
                    boardArray[i][2]=content;
                    boardArray[i][3]=author;
                    boardArray[i][4]="0";
                    boardArray[i][5]=pwd;
                    full=false;
                    break;
                 }
              }
              
              if(full==true) {
                 System.out.println("�Խ����� ��á���ϴ�.");
              }
              

              
           }
           //3.Read
           else if(selectNo.equals("3")) {
              int no;
              System.out.print("��ȣ: ");
              
              no = Integer.parseInt(sc.nextLine());
             
       
              int i;
              
              for(i=0;i<boardNum;i++) {
                 if(boardArray[i][0]==null) {
                    continue;
                 }
                 if(no==Integer.parseInt(boardArray[i][0])) {
                    break;
                 }
              }
              
              if(i>=boardNum) {
                 System.out.println("�߸� �Է��ϼ̽��ϴ�.");
              }
              
              else {
                 int views=Integer.parseInt(boardArray[i][4]);
                 views++;
                 boardArray[i][4]= Integer.toString(views);
                 System.out.println("����:"+boardArray[i][1]);
                 System.out.println("����:"+boardArray[i][2]);
                 System.out.println("�۾���:"+boardArray[i][3]);
                 System.out.println("��ȸ��:"+boardArray[i][4]);
                 System.out.println();
              }
              
           }
           //4.Update
           else if(selectNo.equals("4")) {
                          
              System.out.print("��ȣ: ");
              String no=sc.nextLine();
              System.out.print("��й�ȣ: ");
              pwd=sc.nextLine();
              int i;
              for(i=0;i<boardNum;i++) {
                 if(boardArray[i][0]==null) {
                    continue;
                 }
                 if(no.equals(boardArray[i][0])) {
                    break;
                 }
              }
              if(i>=boardNum) {
                 System.out.println("���� �Խ����Դϴ�.");  
                 selectNo="0";
              }
              else if(pwd.equals(boardArray[i][5])==false){
                 System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");  
                 selectNo="0";
              }
              else {
                 System.out.println("��������: "+boardArray[i][1]);
                 System.out.print("��������: ");
                 String modifytitle=sc.nextLine();
                 if(!modifytitle.equals("")) {
                    boardArray[i][1]=modifytitle;
                 }
                 
                 System.out.println("��������: "+boardArray[i][2]);
                 System.out.print("��������: ");
                 String modifycontent=sc.nextLine();
                 if(!modifycontent.equals("")) {
                    boardArray[i][2]=modifycontent;
                 }
              }
                          
              //�ڵ����� ������� �̵�
              
           }
           //5.Delete
           else if(selectNo.equals("5")) {
              System.out.print("��ȣ: ");
              String no=sc.nextLine();
              System.out.print("��й�ȣ: ");
              pwd=sc.nextLine();
              int i;
              for(i=0;i<boardNum;i++) {
                 if(boardArray[i][0]==null) {
                    continue;
                 }
                 if(no.equals(boardArray[i][0])) {
                    break;
                 }
              }
              
              for(int j=0;j<boardInformation;j++) {
                 if(i>=boardNum) {
                    System.out.println("���� �Խ����Դϴ�.");    
                    selectNo="0";
                    break;
                 }
                 else if(pwd.equals(boardArray[i][5])==false) {
                    System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");    
                    selectNo="0";
                    break;
                 }
                 boardArray[i][j]=null;
              }
              
              //�ڵ����� ������� �̵�
           }
           //6.Exit
           else if(selectNo.equals("6")) {
              run=false;
              System.out.println("���α׷� ����");
           }
           else {
              System.out.println("�߸� �Է��ϼ̽��ϴ�.");
           }
           
           //��� ���
           if(selectNo.equals("2")||selectNo.equals("4")||selectNo.equals("5")) {

              
              //�������� ����
              for(int i=0;i<boardNum;i++) {
                 for(int j=i+1;j<boardNum;j++) {
                    if((boardArray[i][0]==null)||(boardArray[j][0]==null)) {
                       continue;
                    }
                    int m=Integer.parseInt(boardArray[i][0]);
                    int n=Integer.parseInt(boardArray[j][0]);   
                    if(m<n) {
                       String[] temp=boardArray[i];
                       boardArray[i]=boardArray[j];
                       boardArray[j]=temp;
                    }   
                 }
              }
              //���
              System.out.println("��ȣ\t����\t����\t�۾���\t��ȸ��");
              for(int i=0;i<boardNum;i++) {
                 if(boardArray[i][0]!=null) {
                    for(int j = 0; j < boardArray[i].length - 1; j++) {
                       System.out.print(boardArray[i][j]+"\t");
                    }
                    System.out.println();
                 }
             }
           }
           
        }
        
     }

}
