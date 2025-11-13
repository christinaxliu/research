# research
This git repository contains the source code and technical documentations for my research projects and work.

At this moment, it contains:
- Research work within [Dr. Jiang](https://science.jpl.nasa.gov/people/jonathan/)'s research group at the [**NASA Jet Propulsion Laboratory (JPL), California Institute of Technology**](https://www.caltech.edu/research/jpl).
- Research poster presented at [**AstroAI Workshop 2025**](https://astroai.cfa.harvard.edu/workshop/details.html) 
- Research project participated in the 68th [**Washington State Science and Engineering Fair**](https://wssef.org/) (WSSEF 2025) where I won the **First Place** in the **Physics and Astronomy** category (Grade 9 - 12th).
- Research project submitted to [**Regeneron Science Talent Search**](https://www.societyforscience.org/regeneron-sts/)

### Research Areas

I applied data science and machine learning on the following research topics:
- Exoplant habitability
  - Explainable AI in exoplanet habitability studies - applying [SHAP (SHapley Additive exPlanations)](https://shap.readthedocs.io/en/latest/) on exoplanet habitability models
  - Exoplanet habitability machine learning models (KNN, Random Forest, XGBoost, Neural Networks)
  - Exoplanet habitability analysis
- Exoplanet classification
- Planetary system classification

### Publications && Poster Presentations
Journal Publications ([Google Scholar Citations](https://scholar.google.com/citations?user=hqWc_kQAAAAJ&hl=en&oi=ao)):
- [**Revisiting Seager’s 2013 Habitability Diagram with 2025 Data**](https://doi.org/10.3847/2515-5172/add46f), Christina X. Liu and Jonathan H. Jiang. *Research Notes of the American Astronomical Society ([RNAAS](https://journals.aas.org/research-notes/))* 2025, 9 109. [DOI 10.3847/2515-5172/add46f](https://doi.org/10.3847/2515-5172/add46f)
- [**Analysis of Habitability and Stellar Habitable Zones from Observed Exoplanets**](https://doi.org/10.3390/galaxies12060086), Jonathan H. Jiang, Philip E. Rosen, Christina X. Liu, Qianzhuang Wen, and Yanbei Chen. [*Galaxies*](https://www.mdpi.com/journal/galaxies) 2024, 12, no. 6: 86. [DOI 10.3390/galaxies12060086](https://doi.org/10.3390/galaxies12060086)

Poster Presentations:
- [**Analyzing the Impacts of Stellar and Planetary Parameters to Exoplanet Habitability through Machine Learning**](https://astroai.cfa.harvard.edu/workshop/abstracts/posters/liu.html), Christina X. Liu. [*AstroAI Workshop*](https://astroai.cfa.harvard.edu/workshop/details.html) 2025. Center for Astrophysics | Harvard & Smithsonian (CfA)

### Science Fairs
- [**An Analysis of Exoplanet Habitability and Most Influential Stellar and Planetary Parameters to Habitability through the Lens of Machine Learning**](https://github.com/christinaxliu/research/blob/main/WSSEF/WSSEF_2025_ResearchPlan.pdf), Christina X. Liu. [*Washington State Science & Engineering Fair (WSSEF)*](https://wssef.org/) 2025

### Source Code & Research Reports 
- Source code: https://github.com/christinaxliu/research
- Research reports: https://drive.google.com/drive/u/1/folders/1B1dRrJqGsRwMK8p4BuehumHlxLMfq-EP

### Overview of the RNAAS 2025 Paper ([DOI 10.3847/2515-5172/add46f](https://doi.org/10.3847/2515-5172/add46f))

We extended Dr. Sara Seager's 2013 habitability diagram with a much larger and more current dataset of 5,834 confirmed exoplanets from the [NASA Exoplanet Archive](https://exoplanetarchive.ipac.caltech.edu/). We then further highlighted exoplanet types (Terrestrial, Super-Earth, Neptune-Like, Gas-Giant), scaled data points by planet size, and calculated inner and outer HZ boundaries with a simplified greenhouse-based temperature model.

I solely conducted all the work under supervision of Dr. Jiang. My major work including: (1) performing habitable zone calculations for the substantially larger recent dataset, (2) conducting data analysis and visualization, (3) fitting calculated inner and outer HZ boundaries via regression (ended up with 5th-degree polynomial fits), (4) interpreting findings through astrophysical explanations, (5) writing/revising manuscripts with advisory feedback.

![StellarMassVsPlanetOrbit](https://github.com/user-attachments/assets/a2b75cc5-9210-4be2-ad71-1abc89a8ce42)
<img width="827" height="192" alt="Figure1_Description" src="https://github.com/user-attachments/assets/41350fcd-4699-4c79-af25-2d623471b761" />

### Overview of the Galaxies 2024 Paper ([DOI 10.3390/galaxies12060086](https://doi.org/10.3390/galaxies12060086))

I participated in a group project on analysis of exoplanet habitability and stellar habitable zones based on data from the [NASA Exoplanet Archive](https://exoplanetarchive.ipac.caltech.edu/). 

- I indepently trained Random Forest and XGBoost models to predict exoplanet habitablity based on the combined dataset joined with data from the [NASA Exoplanet Archive](https://exoplanetarchive.ipac.caltech.edu/) and the [Habitable Worlds Catalog (HWC)](https://phl.upr.edu/hwc/data). I then conducted feature importance analysis on the models to support and validate our empirical stellar habitable zone formula. Below is the feature importance for the Random Forest model:
  
![RandomForest-FeatureImportannce](https://github.com/user-attachments/assets/37c8027a-4bd4-496f-b0cc-4413129d086a)

- I was also solely responsible for the data analysis and graph plotting for the Figure 11 - *Host Star Effective Temperature vs. Exoplanet Surface Temperature*:
![Figure11](https://github.com/user-attachments/assets/15faae15-7002-495e-bec0-3de99a0ec820)
<img width="759" height="212" alt="Figure11_Description" src="https://github.com/user-attachments/assets/b712f176-dacd-4593-ae2a-c1315589c07b" />

### Overview of the AstroAI Workshop 2025 Poster ([Abstract](https://astroai.cfa.harvard.edu/workshop/abstracts/posters/liu.html))
I applied explainable machine learning technique, [SHAP (SHapley Additive exPlanations)](https://shap.readthedocs.io/en/latest/) on my exoplanet habitability models, not only identifying the most influential stellar/planetary properties for habitability, but also quantitatively understanding how higher/lower values of these properties shift an exoplanet towards or away from habitability. I was invitated to the [*AstroAI Workshop 2025*](https://astroai.cfa.harvard.edu/workshop/details.html) at the Center for Astrophysics | Harvard & Smithsonian (CfA) for a [poster presentation](https://astroai.cfa.harvard.edu/workshop/abstracts/posters/liu.html) of my work ([Abstract](https://astroai.cfa.harvard.edu/workshop/abstracts/posters/liu.html) | [Poster](https://github.com/christinaxliu/research/blob/main/AstroAI/AstroAI_Poster_2025.pdf)).

Below is the abstract of my poster presented at [*AstroAI Workshop 2025*](https://astroai.cfa.harvard.edu/workshop/details.html):
<img width="1222" height="775" alt="Abstract" src="https://github.com/user-attachments/assets/670ab82b-cbf7-4284-b80d-fa3e67a19bd3" />

### Overview of the Project at WSSEF Science Fair
I won the **First Place** in the **Physics and Astronomy** category (Grade 9 - 12th) in the 68th [Washington State Science & Engineering Fair](https://wssef.org/) (WSSEF 2025) with my research project - [**An Analysis of Exoplanet Habitability and Most Influential Stellar and Planetary Parameters to Habitability through the Lens of Machine Learning**](https://github.com/christinaxliu/research/blob/main/WSSEF/WSSEF_2025_ResearchPlan.pdf).

### Overview of the Research Project submitted to Regeneron Science Talent Search
I submitted my research project - [**Applying Explainable AI to Understand How Stellar and Planetary
Parameters Impact Exoplanet Habitability**](https://github.com/christinaxliu/research/blob/main/STS/STSProjectResearchReport.pdf) to [**Regeneron Science Talent Search**](https://www.societyforscience.org/regeneron-sts/) 2026.
- Data processing, feature engineering, modle training, and SHAP analysis pipelines:
  <img width="1367" height="486" alt="Pipelines" src="https://github.com/user-attachments/assets/6aa3fe68-f613-4b1d-89e6-5a3ab6df81fc" />

- Feature importance analysis of Random Forest and XGBoost classifiers throuhg SHAP:
  <img width="2461" height="579" alt="SHAP_FeatureImportantAnalysis" src="https://github.com/user-attachments/assets/15893db8-9bcf-4b42-9de8-a3e726e1a398" />

- SHAP beeswarm plot for Random Forest classifier:
  <img width="1106" height="497" alt="SHAP_beeswarm" src="https://github.com/user-attachments/assets/f2823ab0-3de0-4434-beb8-75e97b8751c7" />

- SHAP heatmap plot for Random Forest classifier:
  <img width="1188" height="558" alt="SHAP_heatmap_plot" src="https://github.com/user-attachments/assets/0dd72252-5f27-4c4b-81b1-6f753c0d3248" />

- SHAP force plot for an exoplanet with habitable prediction outcome (Random Forest classifier):
  <img width="1015" height="116" alt="SHAP_force_plot_positive" src="https://github.com/user-attachments/assets/d569db47-bc54-42c4-a447-112d666b7628" />

- SHAP force plot for an exoplanet with non-habitable prediction outcome (Random Forest classifier):
  <img width="941" height="114" alt="SHAP_force_plot_negative" src="https://github.com/user-attachments/assets/94eb24d8-93ba-47e3-b716-1193e77555bf" />

- SHAP waterfall plot for an exoplanet with habitable prediction outcome (Random Forest classifier):
  <img width="1180" height="600" alt="SHAP_waterfall_plot_postive" src="https://github.com/user-attachments/assets/6499dcf6-2d66-4181-bad6-2ccc6fc92c6c" />

- SHAP waterfall plot for an exoplanet with non-habitable prediction outcome (Random Forest classifier):
  <img width="1242" height="600" alt="SHAP_waterfall_plot_negative" src="https://github.com/user-attachments/assets/07dd29d3-a2d9-4720-8fbd-29c4e397b312" />
