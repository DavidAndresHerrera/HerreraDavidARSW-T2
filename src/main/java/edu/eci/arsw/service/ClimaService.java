package edu.eci.arsw.service;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service("climaService")
public interface ClimaService {

    String getDatos(String ciudad) throws IOException;
}
