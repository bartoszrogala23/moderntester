package com.bartosz.moderntester.common.constants;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Announcements {
    public static final String OK_BUTTON_PRESSED = "OK button pressed";
    public static final String PROMPT_CANCELLED = "User cancelled the prompt.";
    public static final String ENTER_NAME = "Please enter your name:";
}
