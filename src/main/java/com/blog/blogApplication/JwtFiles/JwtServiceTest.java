package com.blog.blogApplication.JwtFiles;

public class JwtServiceTest {
    public static void main(String[] args) {
        JwtService jwtService = new JwtService();

        String token = "eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJodHRwczovL3N1Z2hvc2gtcG9ydGZvbGlvLnZlcmNlbC5hcHAvIiwiZW1haWwiOiJzdWdob3NobWFsbHVyQGdtYWlsLmNvbSIsInN1YiI6IlVzZXJuYW1lIiwiaWF0IjoxNzMyODg4NDIxLCJleHAiOjE3MzI4OTAyMjF9.sPgR2TBCjHIjiArRwAsl-deS04MiQPvsi6rJd5HB5AALqI6D59eEXhg_HqlDqhnvX4uWAuRbdmiCeEKGtL84yw";

        try {
            String email = jwtService.extractEmail(token);
            System.out.println("Extracted Email: " + email);
        } catch (Exception e) {
            System.err.println("Error extracting email: " + e.getMessage());
        }
    }
}
