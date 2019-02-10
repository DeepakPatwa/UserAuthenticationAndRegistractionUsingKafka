//package com.stackroute.pie.controller;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.stackroute.pie.Model.Request;
//import com.stackroute.pie.Model.User;
//import com.stackroute.pie.services.UserDetailsServiceImpl;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//import static org.mockito.Mockito.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(MockitoJUnitRunner.class)
//
//public class UserControllerTest {
//
//        @Autowired
//        private MockMvc mockMVC;
//        @Mock
//        private UserDetailsServiceImpl userProfileService;
//        @InjectMocks
//        private UserControllerTest userController;
//        private int insuredId;
//        private User user;
//        private List<Request> requestList = new ArrayList<>();
//        //    private int trackId=2;
////    private String name="Pal";
////    private List<Track> trackList1 = new ArrayList<>();
//        @Before
//        public void setUp() throws Exception {
//            mockMVC = MockMvcBuilders.standaloneSetup(userController).build();
////        track = new Track("Kal ho na ho", "SonuNigam");
////        trackList.add(track);
//            requestList.add(0,new Request(2,"acc","xyz","abc"));
//            user = new User(1,requestList);
//        }
//        @Test
//        public void getRequestsSuccess() throws Exception {
//            when(userProfileService.getRequests(user.getInsuredId())).thenReturn(user);
//            mockMVC.perform(get("/api/auth/requests/1")
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .content(jsonToString(user)))
//                    .andExpect(status().isOk());
//            verify(userProfileService, Mockito.times(1)).getRequests(user.getInsuredId());
//            verifyNoMoreInteractions(userProfileService);
//        }
//        private static String jsonToString(final Object obj) throws JsonProcessingException {
//            String result;
//            try {
//                final ObjectMapper mapper = new ObjectMapper();
//                final String jsonContent = mapper.writeValueAsString(obj);
//                result = jsonContent;
//            } catch (JsonProcessingException e) {
//                result = "Json processing error";
//            }
//            return result;
//        }
//    }
