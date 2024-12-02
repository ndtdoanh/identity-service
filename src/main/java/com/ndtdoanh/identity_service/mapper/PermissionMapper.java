package com.ndtdoanh.identity_service.mapper;

import com.ndtdoanh.identity_service.dto.request.PermissionRequest;
import com.ndtdoanh.identity_service.dto.request.UserRequest;
import com.ndtdoanh.identity_service.dto.request.UserUpdateRequest;
import com.ndtdoanh.identity_service.dto.response.PermissionResponse;
import com.ndtdoanh.identity_service.dto.response.UserResponse;
import com.ndtdoanh.identity_service.entity.Permission;
import com.ndtdoanh.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
