# App name: GST-DATA-MASTER

## Idea Behind App:
GST (Goods and Services Tax) which was introduced by Govt. of India. In all types of business whether it's local or global the calculation of GST has been a time-consuming task. So to reduce this hustle and bustle we came up with an application GST-DATA-MASTER.
While filing the GST Report every year businessmen and C.A. all around the country have to go through a hell lot of work just in order to make a final report for submission from there system generated so we made their task easy by simplifying the generated data to GSTR final data.
## Functioning:
The user will be able to sign-up through sign-in screen. After sign-up user will be able to navigate to upload screen where the user data in the form of excel file has to be shared from external source (functionality of upload from internal storage is provided). After uploading the calculate button will be provided so that user can click on it and the GST will be calculated. The calculate button gives an API call to a Custom build API in JAVA hosted on Microsoft AZURE which give the final GSTR Sheet to be downloaded. 

## Issues:
The API works fine on the Virtual Machine and the final file is store in it but when give a HTTP call the file data gets corrupted during the transfer and thus shows all values as “1”. Since this was the first time for us building a custom API and using cloud so we could not fix the issue in the time provided.  

## NOTE:
We are uploading the original GST file and the converted GSTR File in GitHub for reference and the GitHub URL to the API is nks102000/GST-Master

![image](https://user-images.githubusercontent.com/61933492/124656265-9501ae80-debe-11eb-98f8-2ef8de93bdc2.png)
![image](https://user-images.githubusercontent.com/61933492/124656337-b19de680-debe-11eb-9a40-e4c79aeb0239.png)
![image](https://user-images.githubusercontent.com/61933492/124656433-d1cda580-debe-11eb-8a95-7452e4e3d293.png)
![image](https://user-images.githubusercontent.com/61933492/124656462-deea9480-debe-11eb-8f9f-934ff6a06f7a.png)
