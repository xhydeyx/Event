import java.util.Scanner;
import java.util.Stack;


public class HandleComplementaryPasses {
    
    Scanner reader=new Scanner(System.in);

    Stack<ComplementaryPasses> compPassess=new Stack<>();

    public void handleComplementaryPasses(){
        int choice=0;
        do{
            System.out.println("\n"+"Here are the compiementary passes operations available to you:"+"\n");
            System.out.println("Type 1 to redeem complementary passes:"+"\n");
            System.out.println("Type 2 to display the list of redeemed complementary passes:"+"\n");
            System.out.println("Type 3 to display the last redeemed complementary pass:"+"\n");
            System.out.println("Type 4 to undo the redeemed complementary pass:"+"\n");
            System.out.println("Type 5 to QUIT:"+"\n");
            choice=reader.nextInt();
            reader.nextLine();
            switch(choice){
                case 1:
                    System.out.println("How many complementary passes would you like to redeem?");
                    int num=reader.nextInt();
                    reader.nextLine();
                    redeemComplementaryPassess(num);
                    break;
                case 2:
                    displayComplementaryPasses();
                    break;
                case 3:
                    displayLastRedeemedComplementaryPass();
                    break;
                case 4:
                    undoRedeemedComlementaryPass();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice.Please enter a valid choice.");
            }
        }while(choice!=5);
    }

    public void redeemComplementaryPassess(int numOfPasses){
        if(compPassess.size()>=10){
            System.out.println("\n"+"Invalid operation.All the complementary passes have already been redeemed.");
            System.out.println("\n"+"Would you like to see the list of redeemed complementary passes?(Y/N)");
            char choice=reader.nextLine().charAt(0);
            if(choice=='Y'){
                displayComplementaryPasses();
                return;
            }
        }else{

            int i=0;

            do{
                System.out.println("Enter the Complementary Pass ID:");
                String ID=reader.nextLine();

                System.out.println("Enter the access level:");
                String accessLevel=reader.nextLine();

                ComplementaryPasses pass=new ComplementaryPasses(ID, accessLevel);
                compPassess.push(pass);
                i++;
            }while(i<numOfPasses);
        }
    }

    public void displayComplementaryPasses(){
        System.out.println("Here is the list of redeemed complementary passes:"+"\n"+compPassess);
    }

    public void displayLastRedeemedComplementaryPass(){
        System.out.println("The last redeemed complementary pass is:"+compPassess.peek());
    }

    public void undoRedeemedComlementaryPass(){
        System.out.println("Enter the Pass ID you want to undo:");
        String ID=reader.nextLine();

        for(ComplementaryPasses pass:compPassess){
            if(pass.getPassID().equals(ID)){
                compPassess.pop();
                System.out.println("The pass with the ID"+ID+"has been removed from the redeemed List.");
                return;
            }else{
                System.out.println("There is no such pass ID in the list");
                return;
            }
        }
    }
}
