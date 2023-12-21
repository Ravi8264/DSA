import java.util.*;

public class medium {
    public static void main(String[] args) {
        List<List<Integer>> wall = Arrays.asList(
                Arrays.asList(1, 2, 2, 1),
                Arrays.asList(3, 1, 2),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 4),
                Arrays.asList(3, 1, 2),
                Arrays.asList(1, 3, 1, 1));

                System.out.println(leastBricks(wall));
    }
    

    public static int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < wall.size(); i++) {
            int sum = 0;
            for (int j = 0; j < wall.get(i).size()-1; j++) {
                sum += wall.get(i).get(j);
                System.out.print(sum+"  ");
                map.put(sum, map.getOrDefault(sum, 0) + 1);
                max = Math.max(max, map.get(sum));

            }
            System.out.println(map);
        }
        System.out.println(max);
        return wall.size() - max;
    }

}
