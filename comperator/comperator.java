package comperator;

public class comperator {
    public static void main(String[] args) {
        
    }
}

Comparator<List<String>> myComparator = (l1, l2) ->
            {
                int comparator = 0 ;
                for(int i = 0 ; i < l1.size() ; i++)
                {
                    comparator = l2.get(i).compareTo(l1.get(i)) ;
                    if( comparator != 0 )
                    return comparator ;
                } 
                return 0 ;
            } ;
        Collections.sort(res, myComparator) ;