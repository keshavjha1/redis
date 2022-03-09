import elevator.Employee;
import redis.clients.jedis.Jedis;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

public class Redisclient {

    public static void main(String[] args) {
        try {

            Jedis jedis = new Jedis("localhost",7000);
            System.out.println("Connection Successful");
            System.out.println("The server is running " + jedis.ping());
            jedis.set("company-name", "500Rockets.io");
            System.out.println("Stored string in redis: " + jedis.get("company-name"));
            int max=10000;
            int min=5000;
            for(int i=0;i<10000;i++){
                int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                Employee e= new Employee(i, random_int);
                jedis.set(LocalDate.now().toString()+"i", String.valueOf(e));
            }
            System.out.println("finished execution");
        } catch (Exception e) {
            System.out.println(e);
        }

    }}
