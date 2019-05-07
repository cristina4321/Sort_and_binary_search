public class sort_and_binary_search {
    public static void main(String[] args) {

        int i=0,var;
        int [] array = new int [] {8,4,9,1,2,222};
        int prima_pozitie=0, ultima_pozitie =array.length - 1 , mijloc = (prima_pozitie+ultima_pozitie)/2, caut = 2;
        boolean aranjare;

        do
        {
            aranjare = false;
            for( i = 0; i< array.length - 1 ;i++)
            {
                if(array[i]>array[i+1])
                {
                    var = array[i];
                    array[i] = array[i+1];
                    array[i+1]= var;
                    aranjare = true;
                }
            }
        }while(aranjare);


        while (prima_pozitie <= ultima_pozitie) {
            if (array[mijloc] < caut)
                prima_pozitie = mijloc + 1;
            else if (array[mijloc] == caut) {
                break;
            }
            else
                ultima_pozitie = mijloc - 1;

            mijloc = (prima_pozitie + ultima_pozitie)/2;
        }

        if(array[mijloc]!=caut)
        {
            System.out.println("Numarul cautat nu exista !");
        }
        else  {
            System.out.println(array[mijloc]);
        }
    }
}
