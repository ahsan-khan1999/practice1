import java.util.ArrayList;
import java.util.Scanner;

public class TestModem {
    public static void main(String[] args){

        ArrayList<Modem> arrayList = new ArrayList<>(2);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i  < 1 ; ++i) {
            String type = scanner.nextLine();

            if(type.equals("HuaweiModems")){
                arrayList.add(new HuaweiModems());
                arrayList.get(i).open();
            }
            else if(type.equals("MindStickModems")){
                arrayList.add(new MindStickModems());
            }
            else{
                System.out.println("Invalid input");
            }

        }

    }
}
