package com.trichain.market.api;


import com.trichain.market.api.util.ResponseUtil;
import com.trichain.market.entities.DefaultTable;
import com.trichain.market.persistence.repository.DefaultRepository;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.Optional;

@Controller
public class DefaultApi {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultApi.class);

    @Autowired
    private DefaultRepository defaultRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> getDoc() {
        LOG.info("==================== about to get  doc ");
        return ResponseUtil.getOkResponse("You're good now");
    }

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public ResponseEntity<?> putDoc(@PathVariable("id") String id) throws IOException {
        LOG.info("==================== about to get   ");
        Optional<DefaultTable> defaultTable = defaultRepository.findById(id);
        return ResponseUtil.getOkResponse(defaultTable);
    }


}
