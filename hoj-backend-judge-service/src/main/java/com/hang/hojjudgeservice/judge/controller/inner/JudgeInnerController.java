package com.hang.hojjudgeservice.judge.controller.inner;


import com.hang.hojjudgeservice.judge.JudgeService;
import com.hang.hojmodel.model.entity.QuestionSubmit;
import com.hang.hojserviceclient.service.JudgeFeignClient;
import com.hang.hojserviceclient.service.QuestionFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 该服务仅内部调用,不是给前端的
 */
@RestController
@RequestMapping("/inner")
public class JudgeInnerController implements JudgeFeignClient {

    @Resource
    private JudgeService judgeService;

    /**
     * @param questionSubmitId
     * @return
     */
    @Override
    @PostMapping("/do")
    public QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId){
        return judgeService.doJudge(questionSubmitId);
    }
}
