package com.carsdealershop.service.services;

import com.carsdealershop.service.models.CarServiceModel;

import java.util.List;

public interface CarService {

    CarServiceModel save(CarServiceModel model);

    List<CarServiceModel> getCars();
}
