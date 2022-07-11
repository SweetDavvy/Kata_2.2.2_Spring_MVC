package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCarsByCount(int count) {
        return carDao.getCarsByCount(count);
    }

}
