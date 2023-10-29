package pl.kamil.hrv.device.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kamil.hrv.service.HeartbeatData;
import pl.kamil.hrv.service.HeartbeatService;

import java.util.Map;

@RestController
@RequestMapping("/heartbeat-data")
public class HeartbeatRestController {

    private final HeartbeatService heartbeatService;

    public HeartbeatRestController(HeartbeatService heartbeatService) {
        this.heartbeatService = heartbeatService;
    }

    @PostMapping
    public ResponseEntity<String> sendData(@RequestBody HeartbeatData heartBeatObject) {
        var success = heartbeatService.processHeartbeatData(heartBeatObject);
        return success ? ResponseEntity.ok("Okejka") : ResponseEntity.badRequest().body("zjebalo sie");
    }
}
