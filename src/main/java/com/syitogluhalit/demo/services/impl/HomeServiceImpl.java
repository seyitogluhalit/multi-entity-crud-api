package com.syitogluhalit.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syitogluhalit.demo.dto.DtoHome;
import com.syitogluhalit.demo.dto.DtoRoom;
import com.syitogluhalit.demo.entities.Home;
import com.syitogluhalit.demo.entities.Room;
import com.syitogluhalit.demo.repository.HomeRepository;
import com.syitogluhalit.demo.services.IHomeService;

@Service
public class HomeServiceImpl implements IHomeService {

    @Autowired
    private HomeRepository homeRepository;

    @Override
    public DtoHome findHomeById(Long id) {
        DtoHome dtoHome = new DtoHome();

        Optional<Home> optional = homeRepository.findById(id);
        if (optional.isEmpty()) {
            return null;
        }

        Home home = optional.get();
        List<Room> rooms = home.getRoom();

        BeanUtils.copyProperties(home, dtoHome);

        if (rooms != null && !rooms.isEmpty()) {
            for (Room room : rooms) {
                DtoRoom dtoRoom = new DtoRoom();
                BeanUtils.copyProperties(room, dtoRoom);
                dtoHome.getRooms().add(dtoRoom);
            }
        }

        return dtoHome;
    }
}
