package com.ndtdoanh.identity_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.ndtdoanh.identity_service.dto.request.UserRequest;
import com.ndtdoanh.identity_service.dto.request.UserUpdateRequest;
import com.ndtdoanh.identity_service.dto.response.UserResponse;
import com.ndtdoanh.identity_service.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
