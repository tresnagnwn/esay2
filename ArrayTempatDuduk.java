import java.util.ArrayList;


public class ArrayTempatDuduk {
    public static void main(String[] args) {
        String tempat_duduk[][] = {
            {"andi","","adi","rena"},
            {"","tuti","","ella"},
            {"anto","","","lila"},
            
        };
        ArrayList<String>waiting_list = new ArrayList<>();
        waiting_list.add("dodi");
        waiting_list.add("ashel");
        waiting_list.add("lia");
        waiting_list.add("tanto");
        waiting_list.add("ucok");
        waiting_list.add("deden");
        
        for (int i = 0; i <tempat_duduk.length; i++) {
            for (int j = 0; j <tempat_duduk[i].length; j++) {
                if(tempat_duduk[i][j].equals("")){
                    tempat_duduk[i][j]=waiting_list.get(0);
                    
                }
                System.out.println(tempat_duduk[i][j]+"-");                
            }
            System.out.println("");            
        }
        if (waiting_list.size()> 0){
            System.out.println(waiting_list +"tidak ada tempat duduk kosong");
        }
    }
    
}
