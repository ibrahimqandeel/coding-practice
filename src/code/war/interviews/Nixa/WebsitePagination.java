  /*
   * Complete the 'fetchItemsToDisplay' function below.
   *
   * The function is expected to return a STRING_ARRAY.
   * The function accepts following parameters:
   *  1. 2D_STRING_ARRAY items
   *  2. INTEGER sortParameter
   *  3. INTEGER sortOrder
   *  4. INTEGER itemsPerPage
   *  5. INTEGER pageNumber
   */
  package code.war.interviews.Nixa;

  import java.util.*;

  public class WebsitePagination {
      /*public static void main(String[] args) throws IOException {
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

          int itemsRows = Integer.parseInt(bufferedReader.readLine().trim());
          int itemsColumns = Integer.parseInt(bufferedReader.readLine().trim());

          List<List<String>> items = new ArrayList<>();

          IntStream.range(0, itemsRows).forEach(i -> {
              try {
                  items.add(
                          Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                  .collect(toList())
                  );
              } catch (IOException ex) {
                  throw new RuntimeException(ex);
              }
          });

          int sortParameter = Integer.parseInt(bufferedReader.readLine().trim());

          int sortOrder = Integer.parseInt(bufferedReader.readLine().trim());

          int itemsPerPage = Integer.parseInt(bufferedReader.readLine().trim());

          int pageNumber = Integer.parseInt(bufferedReader.readLine().trim());

          List<String> result = Result.fetchItemsToDisplay(items, sortParameter, sortOrder, itemsPerPage, pageNumber);

          bufferedWriter.write(
                  result.stream()
                          .collect(joining("\n"))
                          + "\n"
          );

          bufferedReader.close();
          bufferedWriter.close();
      }

       */

      public static void main(String[] args) {
          List<List<String>> items = new ArrayList<>();
          List<String> item1 = new ArrayList<>();
          item1.add("item1");
          item1.add("10");
          item1.add("15");

          List<String> item2 = new ArrayList<>();
          item2.add("item2");
          item2.add("3");
          item2.add("4");

          List<String> item3 = new ArrayList<>();
          item3.add("item3");
          item3.add("17");
          item3.add("8");

          items.add(item2);
          items.add(item3);
          items.add(item1);

          List<String> result = fetchItemsToDisplay(items, 1, 0, 20, 0);
          for (String temp : result) {
              System.out.println(temp);
          }
      }

      public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int itemsPerPage, int pageNumber) {
          List<String> sortedList = new ArrayList<>();
          switch (sortParameter) {
              case 0:
                  items.sort(new ItemSorter(sortParameter));
                  break;
              default:
                  items.sort(new ItemSorterInteger(sortParameter));
          }
          if (sortOrder == 1) {
              Collections.reverse(items);
          }

          int startIndex = 0;
          int loopSize = startIndex + itemsPerPage;
          if (loopSize > items.size()) {
              loopSize = items.size();
          }

          if (pageNumber > 0) {
              startIndex = loopSize;
              loopSize = (itemsPerPage * pageNumber) + 1;
          }

          if (startIndex <= items.size() && loopSize <= items.size()) {
              for (int i = startIndex; i < loopSize; i++) {
                  sortedList.add(items.get(i).get(0));
              }
          }

          return sortedList;
      }
  }

  class ItemSorter implements Comparator<List<String>> {
      private int itemIndex;

      public ItemSorter(int itemIndex) {
          this.itemIndex = itemIndex;
      }

      @Override
      public int compare(List<String> o1, List<String> o2) {
          return o1.get(itemIndex).compareTo(o2.get(itemIndex));
      }
  }

  class ItemSorterInteger implements Comparator<List<String>> {
      private int itemIndex;

      public ItemSorterInteger(int itemIndex) {
          this.itemIndex = itemIndex;
      }

      @Override
      public int compare(List<String> o1, List<String> o2) {
          Integer v1 = Integer.valueOf(o1.get(itemIndex));
          Integer v2 = Integer.valueOf(o2.get(itemIndex));
          return v1.compareTo(v2);
      }
  }