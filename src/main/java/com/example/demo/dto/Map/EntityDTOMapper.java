package com.example.demo.dto.Map;


import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

public class  EntityDTOMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static <D, E> D mapEntityToDTO(E entity, Class<D> dtoClass) {
        return modelMapper.map(entity, dtoClass);
    }

    public static <D, E> E mapDTOToEntity(D dto, Class<E> entityClass) {
        return modelMapper.map(dto, entityClass);
    }

    public static <D, E> List<D> mapEntityListToDTOList(List<E> entityList, Class<D> dtoClass) {
        return modelMapper.map(entityList, new TypeToken<List<D>>() {}.getType());
    }

    public static <D, E> List<E> mapDTOListToEntityList(List<D> dtoList, Class<E> entityClass) {
        return modelMapper.map(dtoList, new TypeToken<List<E>>() {}.getType());
    }
}