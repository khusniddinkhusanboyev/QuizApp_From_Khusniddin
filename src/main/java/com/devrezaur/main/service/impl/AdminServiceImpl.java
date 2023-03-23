package com.devrezaur.main.service.impl;

import com.devrezaur.main.dto.QuestionDTO;
import com.devrezaur.main.model.Question;
import com.devrezaur.main.repository.AdminRepository;
import com.devrezaur.main.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class AdminServiceImpl implements AdminService {


    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }


    @Override
    public Question save(Question question) {
        return adminRepository.save(question);
    }

    @Override
    public List<Question> list() {
        return adminRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        adminRepository.deleteById(id);
    }



    @Override
    public QuestionDTO findById(Integer id) {
        Question question= adminRepository.findById(id).get();
        return new QuestionDTO(
                question.getQuesId(),
                question.getImageUrl(),
                question.getTitle(),
                question.getOptionA(),
                question.getOptionB(),
                question.getOptionC(),
                question.getOptionD(),
                question.getAns()
        );
    }
}
