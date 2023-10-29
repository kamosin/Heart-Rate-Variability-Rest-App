package pl.kamil.hrv.service;

public record HeartbeatData(Long epochDate, Integer beatsPerMinute, Double MSSD, Long userId){
}
