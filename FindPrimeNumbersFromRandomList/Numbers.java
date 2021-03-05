
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Numbers {    
    public void GenerationRandomList() {
     
       
        List<Integer> randomList = new ArrayList<>();
        Random rn = new Random();

        for (int counter = 1; counter <= 100; counter++) {
            randomList.add(rn.nextInt(1000));


        }   System.out.println("---------------------Random List of 100 Numbers------------------------------------------"); 
            System.out.println( randomList + " ");


            System.out.println();
            System.out.println("--------------------- List of prime Numbers------------------------------------------");
            System.out.println(randomList.stream().filter(FindPrimeNumbers::isPrime).collect(Collectors.toList()));

        
        
    }

}