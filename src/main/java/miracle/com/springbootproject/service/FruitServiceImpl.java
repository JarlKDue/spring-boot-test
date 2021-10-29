package miracle.com.springbootproject.service;

import miracle.com.springbootproject.FruitRepository;
import miracle.com.springbootproject.model.Fruit;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FruitServiceImpl implements FruitService{

    private final FruitRepository fruitRepository;

    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }


    @Override
    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }
}
