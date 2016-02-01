package com.bcc481.services;


public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}