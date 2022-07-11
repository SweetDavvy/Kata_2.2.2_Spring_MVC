package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
   private static final List<Car> carList = new ArrayList<>();

   {
      carList.add(new Car("v8","MB",7777));
      carList.add(new Car("v6","BMW",1111));
      carList.add(new Car("v4","AUDI",3333));
      carList.add(new Car("v5","AUDI",4444));
      carList.add(new Car("v8","DODGE",8888));
   }

   @Override
   public List<Car> getCarsByCount(int count) {
      if (count == 0) {
         return carList;
      }

      return carList.stream().limit(count).collect(Collectors.toList());
   }


}
