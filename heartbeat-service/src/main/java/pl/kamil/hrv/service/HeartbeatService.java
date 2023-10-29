package pl.kamil.hrv.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HeartbeatService {

    private static final Logger logger = LoggerFactory.getLogger(HeartbeatService.class);

    public boolean processHeartbeatData (HeartbeatData data) {
        logger.info("Information about hrv: {}", data);
        return true;
    }
}
