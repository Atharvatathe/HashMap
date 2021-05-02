import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class MyHashTest {
    @Test
    public void givenASentenceWhenWordAreAddedToList_shouldBeReturnwordFrequency(){
        String sentence = "To be or not to be";
      MyHashMap<String,Integer> myHashMap =   new MyHashMap<>();
      String[] words = sentence.toLowerCase().split(" ");
      for(String word : words){
          Integer value = myHashMap.get(word);
          if(value == null) value = 1;
          else value = value + 1;
          myHashMap.add(word,value);
      }
      int frequency = myHashMap.get("to");
      System.out.println(myHashMap);
        Assertions.assertEquals(2,frequency);
    }


    @Test
    public void givenASentence_WhenWordsAreAddedToList_ShouldBeRemoveWordFromList(){
        String sentence = "Paranoids are not paranoid because they are paranoid but because " +
                "they keep putting themselves deliberately into paranoid avoidable situations";
        MyLinkedHashMap<String,Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words){
            Integer value = myLinkedHashMap.get(word);
            if(value == null) value=1;
            else value=value+1;
            myLinkedHashMap.add(word,value);
        }

        INode removedNode = myLinkedHashMap.remove("avoidable");
        System.out.println("Removed Kye: " +removedNode.getKey());
        Assertions.assertEquals("avoidable",removedNode.getKey());
    }

}
