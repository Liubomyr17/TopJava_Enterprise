package ru.javawebinar.topjava.util.exception;

import javax.lang.model.type.ErrorType;

public class ErrorInfo {

        private final String url;
        private final ErrorType type;
        private final String detail;

        public ErrorInfo(CharSequence url, ErrorType type, String detail) {
            this.url = url.toString();
            this.type = type;
            this.detail = detail;
        }
    }
