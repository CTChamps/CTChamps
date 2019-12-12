import java.util.Scanner;

class Expenses {
    
    String description;
    String category;
    int amount;
    
}

class System {

    Expenses[] expense;
    
    private static void edit_Mode(){
        
    }

    private static void analysis_Mode(){
        
    }
    
    private static void choice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter if you want to go into the edit mode or analysis mode: ");
        String Choice = sc.nextLine();
        if (Choice == "edit") {
            edit_Mode();
        }
        else {
            analysis_Mode();
        }
        
    }
    
    private static void main(String[] args){
        choice();
    }

}
