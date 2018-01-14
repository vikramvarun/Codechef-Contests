Problem description.
An Institute is organising an programming contest.The office team of institute asks the students to submitted their application form for various posts in contest.And also asks them to put their student id ( X ) in the application form.After few days when the office team was selecting the application forms they found that some of the students have applied for multiple posts which was not allowed.There were many applications so they can't find total students for disqualifying the students.So the office team contact you to create a program to find out those students and remove their application form.
Note : Student ID consist of only numerical digits.

Input
The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test contains the number of application forms N
The next line contains the student ID of each application form X
 

Output
For each test case, output a single line containing the student IDs of those application form which is eligible.
 

Constraints
1 ≤ T ≤ 102
1 ≤ N ≤ 103
1 ≤ X ≤ 103
 

Example
Input:
2
5
15 1 5 1 70
11
3 47 5 88 5 7 5 7 2 99 2

Output:
15 5 70
3 47 88 99
 

Explanation
Example case 1.In first test case the application form with student ID 5 , 7 , 2 have applied for respectively 3 , 2 , 2 posts in contest so that their application forms for every post is rejected.
