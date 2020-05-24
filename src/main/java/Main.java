import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        SomeData someData = new SomeData();
        someData.setParam1(100);
        someData.setParam2(true);
        someData.setParam3("Fuck them all !!!");

        String result = objectMapper.writeValueAsString(someData);
        System.out.println(result);

        SomeData newData = objectMapper.readValue(result, SomeData.class);
        System.out.println(newData);

    }

}