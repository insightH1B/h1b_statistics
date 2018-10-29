# Problem
Calculate two metrics: **Top 10 Occupations** and **Top 10 States** for **certified** visa applications to help a newspaper editor to research immigration data trends on H1B(H-1B, H-1B1, E-3) visa application processing over the past years.
* top_10_occupations.txt: Top 10 occupations for certified visa applications
* top_10_states.txt: Top 10 states for certified visa applications

# Approach
The program will count all the certified occupations and certifed work states, and then use a Max Heap to get the top 10 records.

# Run instructions
1. Users must put their raw data file in input folder
2. Users must name their raw data file as h1b_input.csv.
3. After puting the data file in input folder, users can run the script run.sh.
4. The program will create two output file under output folder: `top_10_occupations.txt`, `top_10_states.txt`.