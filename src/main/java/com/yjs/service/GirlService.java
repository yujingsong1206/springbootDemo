package com.yjs.service;

import com.yjs.domain.Girl;
import com.yjs.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by song-pc on 2017/10/10.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girl1 = new Girl();
        girl1.setCupSize("A");
        girl1.setAge(19);
        girlRepository.save(girl1);

        Girl girl2 = new Girl();
        girl2.setCupSize("B");
        girl2.setAge(20);
        girlRepository.save(girl2);
    }

    public Girl findOne(Integer id) {
        return girlRepository.findOne(id);
    }
}
