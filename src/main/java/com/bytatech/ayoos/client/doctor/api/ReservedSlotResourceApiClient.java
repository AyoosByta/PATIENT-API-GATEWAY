package com.bytatech.ayoos.client.doctor.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.client.doctor.DoctorClientConfiguration;

@FeignClient(name="${doctor.name:doctor}", url="${doctor.url:35.184.100.236:8083/}", configuration = DoctorClientConfiguration.class)
public interface ReservedSlotResourceApiClient extends ReservedSlotResourceApi {
}