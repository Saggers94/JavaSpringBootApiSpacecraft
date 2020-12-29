package com.springboot.spacecrafts;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.springboot.spacecrafts.model.Category;
import com.springboot.spacecrafts.model.Phase;
import com.springboot.spacecrafts.model.Spacecraft;
import com.springboot.spacecrafts.model.User;
import com.springboot.spacecrafts.repository.CategoryRepository;
import com.springboot.spacecrafts.repository.SpacecraftRepository;
import com.springboot.spacecrafts.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApiForSpacecraftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApiForSpacecraftApplication.class, args);
	}
	
	
	@Component
	class DemoCommandLineRunner implements CommandLineRunner{

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		long nextId = 0L;
		
		@Autowired
		public SpacecraftRepository spacecraftRepository;
		
		@Autowired
		public CategoryRepository categoryRepository;
		
		@Autowired
		public UserRepository userRepository;
		
		

		
		
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
//			String user_name, String user_email, String user_password, boolean is_admin, Date created,
//			Date updated
			
			User oneU = new User("sagar","sagar@gmail.com","simmu",false,date,date);
			userRepository.save(oneU);
			
			User twoU = new User("simran","simran@gmail.com","sagu",false,date,date);
			userRepository.save(twoU);

			Category one = new Category("Space Probe",date,date);
			categoryRepository.save(one);
			
			Category two = new Category("Orbiter Spacecraft",date,date);
			categoryRepository.save(two);
			
			Category three = new Category("Robotic Mars Lander",date,date);
			categoryRepository.save(three);
			
			Category four = new Category("Lander Spacecraft",date,date);
			categoryRepository.save(four);
			
			Category five = new Category("Penetrator Spacecraft",date,date);
			categoryRepository.save(five);
			
			Phase phase[] = Phase.values();
			
//			Spacecraft oneS = new  Spacecraft(String spacecraft_name, String spacecraft_image, String spacecraft_mission,
//					String spacecraft_description_of_mission, Phase spacecraft_phase, String spacecraft_launch,
//					int spacecraft_days_in_orbit, Category category, Date created, Date updated);
			
			Spacecraft oneS = new  Spacecraft("International Space Station", "international_space_station.jpg", "The International Space Station (ISS) is a modular space station (habitable artificial satellite) in low Earth orbit. It is a multinational collaborative project between five participating space agencies: NASA (United States), Roscosmos (Russia), JAXA (Japan), ESA (Europe), and CSA (Canada).[6][7] The ownership and use of the space station is established by intergovernmental treaties and agreements.[8] The station serves as a microgravity and space environment research laboratory in which scientific research is conducted in astrobiology, astronomy, meteorology, physics, and other fields.[9][10][11] The ISS is suited for testing the spacecraft systems and equipment required for possible future long-duration missions to the Moon and Mars.[12]",
					"The ISS programme evolved from the Space Station Freedom, an American proposal which was conceived in 1984 to construct a permanently crewed Earth-orbiting station,[13] and the contemporaneous Soviet/Russian Mir-2 proposal with similar aims. The ISS is the ninth space station to be inhabited by crews, following the Soviet and later Russian Salyut, Almaz, and Mir stations and the U.S. Skylab. It is the largest artificial object in space and the largest satellite in low Earth orbit, regularly visible to the naked eye from Earth's surface.[14][15] It maintains an orbit with an average altitude of 400 kilometres (250 mi) by means of reboost manoeuvres using the engines of the Zvezda Service Module or visiting spacecraft.[16] The ISS circles the Earth in roughly 93 minutes, completing 15.5 orbits per day.[17]\n"
					+ " \n"
					+ " 				The station is divided into two sections: the Russian Orbital Segment (ROS), operated by Russia; and the United States Orbital Segment (USOS), which is shared by many nations. Roscosmos has endorsed the continued operation of ROS through 2024,[18] having previously proposed using elements of the segment to construct a new Russian space station called OPSEK.[19] The first ISS component was launched in 1998, and the first long-term residents arrived on 2 November 2000.[20] The station has since been continuously occupied for 19 years and 363 days,[21] the longest continuous human presence in low Earth orbit, having surpassed the previous record of 9 years and 357 days held by the Mir space station. The latest major pressurised module, Leonardo, was fitted in 2011 and an experimental inflatable space habitat was added in 2016. Development and assembly of the station continues, with several major new Russian elements scheduled for launch starting in 2020. As of December 2018, the station is expected to operate until 2030.[22]\n"
					+ " \n"
					+ " 				The ISS consists of pressurised habitation modules, structural trusses, photovoltaic solar arrays, thermal radiators, docking ports, experiment bays and robotic arms. Major ISS modules have been launched by Russian Proton and Soyuz rockets and US Space Shuttles.[23] The station is serviced by a variety of visiting spacecraft: the Russian Soyuz and Progress, the U.S. Dragon and Cygnus, the Japanese H-II Transfer Vehicle,[6] and, formerly, the European Automated Transfer Vehicle. The Dragon spacecraft allows the return of pressurised cargo to Earth, which is used, for example, to repatriate scientific experiments for further analysis. As of September 2019, 239 astronauts, cosmonauts, and space tourists from 19 different nations have visited the space station, many of them multiple times. This includes 151 Americans, 47 Russians, nine Japanese, eight Canadians, five Italians, four French, three Germans, and one each from Belgium, Brazil, Denmark, Kazakhstan, Malaysia, the Netherlands, South Africa, South Korea, Spain, Sweden, the United Arab Emirates, and the United Kingdom.[24] ", 
					phase[0], "20 November 1998 21 years ago",
					7960, two, date, date);
			spacecraftRepository.save(oneS);
			
			Spacecraft twoS = new Spacecraft("Voyager 1","voyager1.png","Voyager 1 is a space probe that was launched by NASA on September 5, 1977. Part of the Voyager program to study the outer Solar System, Voyager 1 was launched 16 days after its twin, Voyager 2. Having operated for 43 years, 1 month and 25 days as of October 30, 2020 UTC [refresh], the spacecraft still communicates with the Deep Space Network to receive routine commands and to transmit data to Earth. Real-time distance and velocity data is provided[3] by NASA and JPL. At a distance of 150.6 AU (22.5 billion km; 14.0 billion mi) from Earth as of September 17, 2020,[4] it is the most distant man-made object from Earth.[5]",
					"Voyager 1 is a space probe that was launched by NASA on September 5, 1977. Part of the Voyager program to study the outer Solar System, Voyager 1 was launched 16 days after its twin, Voyager 2. Having operated for 43 years, 1 month and 25 days as of October 30, 2020 UTC [refresh], the spacecraft still communicates with the Deep Space Network to receive routine commands and to transmit data to Earth. Real-time distance and velocity data is provided[3] by NASA and JPL. At a distance of 150.6 AU (22.5 billion km; 14.0 billion mi) from Earth as of September 17, 2020,[4] it is the most distant man-made object from Earth.[5]\n"
					+ " \n"
					+ " 			The probe's objectives included flybys of Jupiter, Saturn, and Saturn's largest moon, Titan. Although the spacecraft's course could have been altered to include a Pluto encounter by forgoing the Titan flyby, exploration of the moon took priority because it was known to have a substantial atmosphere.[6][7][8] Voyager 1 studied the weather, magnetic fields, and rings of the two planets and was the first probe to provide detailed images of their moons.\n"
					+ " \n"
					+ " 			As part of the Voyager program, like its sister craft Voyager 2, the spacecraft is in an extended mission to locate and study the regions and boundaries of the outer heliosphere, and to begin exploring the interstellar medium. Voyager 1 crossed the heliopause and entered interstellar space on August 25, 2012, making it the first spacecraft to do so.[9][10] Two years later, Voyager 1 began experiencing a third \"tsunami wave\" of coronal mass ejections from the Sun, that has continued to at least December 15, 2014, further confirming that the probe is indeed in interstellar space.[11]\n"
					+ " \n"
					+ " 			In a further testament to the robustness of Voyager 1, the Voyager team tested the spacecraft's trajectory correction maneuver (TCM) thrusters in late 2017 (the first time these thrusters had been fired since 1980), a project enabling the mission to be extended by two to three years.[12] Voyager 1's extended mission is expected to continue until about 2025 when its radioisotope thermoelectric generators will no longer supply enough electric power to operate its scientific instruments.[13] ",
					phase[1],"September 5 1977 12:56:00 UTC",15705,one,date,date);
			spacecraftRepository.save(twoS);
			
			Spacecraft threeS = new Spacecraft("Insight","insight.png","The InSight mission placed a single stationary lander on Mars to study its deep interior and address a fundamental issue of planetary and Solar System science: understanding the processes that shaped the rocky planets of the inner Solar System (including Earth) more than four billion years ago.[48]\n"
					+ "         	InSight's primary objective is to study the earliest evolutionary processes that shaped Mars. By studying the size, thickness, density and overall structure of Mars' core, mantle and crust, as well as the rate at which heat escapes from the planet's interior, InSight will provide a glimpse into the evolutionary processes of all of the rocky planets in the inner Solar System.[49][48] The rocky inner planets share a common ancestry that begins accretion. As the body increases in size, its interior heats up and evolves to become a terrestrial planet, containing a core, mantle and crust.[50] Despite this common ancestry, each of the terrestrial planets is later shaped and molded through the poorly understood process of differentiation. InSight mission's goal is to improve the understanding of this process and, by extension, terrestrial evolution, by measuring the planetary building blocks shaped by this differentiation: a terrestrial planet's core, mantle and crust.[50] \n"
					+ "         	The Interior Exploration using Seismic Investigations, Geodesy and Heat Transport (InSight)[1] mission is a robotic lander designed to study the deep interior of the planet Mars.[1][12][13] It was manufactured by Lockheed Martin Space Systems, is managed by NASA's Jet Propulsion Laboratory, and most of its scientific instruments were built by European agencies. The mission launched on 5 May 2018 at 11:05 UTC aboard an Atlas V-401 rocket[5] and successfully landed[14] at Elysium Planitia on Mars on 26 November 2018 at 19:52:59 UTC.[15][16][5][17] InSight traveled 483 million km (300 million mi) during its journey.[18]",
					"The mission will determine if there is any seismic activity, measure the rate of heat flow from the interior, estimate the size of Mars' core and whether the core is liquid or solid.[51] This data would be the first of its kind for Mars.[47] It is also expected that frequent meteor airbursts (10–200 detectable events per year for InSight) will provide additional seismo-acoustic signals to probe the interior of Mars.[52] The mission's secondary objective is to conduct an in-depth study of geophysics, tectonic activity and the effect of meteorite impacts on Mars, which could provide knowledge about such processes on Earth. Measurements of crust thickness, mantle viscosity, core radius and density, and seismic activity should result in a three- to tenfold increase in accuracy compared to current data.[47] This is the first time a robotic lander dug this deep into the martian crust.\n"
					+ " \n"
					+ " 			In terms of fundamental processes shaping planetary formation, it is thought that Mars contains the most in-depth and accurate historical record, because it is big enough to have undergone the earliest accretion and internal heating processes that shaped the terrestrial planets, but is small enough to have retained signs of those processes.[48] The science phase is expected to last for two years.[1] ",
					phase[0],"26 November 2018 19:52:59 UTC[2]",685,three,date,date);
			spacecraftRepository.save(threeS);
			
			Spacecraft fourS = new Spacecraft("Voyager 2","voyager2.png","Voyager 2 is a space probe launched by NASA on August 20, 1977, to study the outer planets. A part of the Voyager program, it was launched 16 days before its twin, Voyager 1, on a trajectory that took longer to reach Jupiter and Saturn but enabled further encounters with Uranus and Neptune.[4] It is the only spacecraft to have visited either of these two ice giant planets. Voyager 2 is the fourth of five spacecraft to achieve the Solar escape velocity, which will allow it to leave the Solar System.",
					"Its primary mission ended with the exploration of the Neptunian system on October 2, 1989, after having visited the Uranian system in 1986, the Saturnian system in 1981, and the Jovian system in 1979. Voyager 2 is now in its extended mission to study Interstellar Space and has been operating for 43 years, 2 months and 9 days as of October 30, 2020. It remains in contact through the NASA Deep Space Network.[5]\n"
					+ " \n"
					+ " 			On November 5, 2018, at a distance of 122 AU (1.83×1010 km) (about 16:58 light-hours)[6] from the Sun,[7] moving at a velocity of 15.341 km/s (55,230 km/h)[8] relative to the Sun, Voyager 2 left the heliosphere, and entered the interstellar medium (ISM), a region of outer space beyond the influence of the Solar System, joining Voyager 1 which had reached the interstellar medium in 2012.[9][10][11][12] Voyager 2 has begun to provide the first direct measurements of the density and temperature of the interstellar plasma.[13] \n"
					+ " \n"
					+ " \n"
					+ " 			In the early space age, it was realized that a periodic alignment of the outer planets would occur in the late 1970s and enable a single probe to visit Jupiter, Saturn, Uranus, and Neptune by taking advantage of the then-new technique of gravity assists. NASA began work on a Grand Tour, which evolved into a massive project involving two groups of two probes each, with one group visiting Jupiter, Saturn, and Pluto and the other Jupiter, Uranus, and Neptune. The spacecraft would be designed with redundant systems to ensure survival through the entire tour. By 1972 the mission was scaled back and replaced with two Mariner-derived spacecraft, the Mariner Jupiter-Saturn probes. To keep apparent lifetime program costs low, the mission would include only flybys of Jupiter and Saturn, but keep the Grand Tour option open.[4]:263 As the program progressed, the name was changed to Voyager.[14]\n"
					+ " \n"
					+ " 			The primary mission of Voyager 1 was to explore Jupiter, Saturn, and Saturn's moon, Titan. Voyager 2 was also to explore Jupiter and Saturn, but on a trajectory that would have the option of continuing on to Uranus and Neptune, or being redirected to Titan as a backup for Voyager 1. Upon successful completion of Voyager 1's objectives, Voyager 2 would get a mission extension to send the probe on towards Uranus and Neptune.[4] ",
					phase[1],"August 20 1977 14:29:00 UTC",15800,one,date,date);
			spacecraftRepository.save(fourS);
			
			Spacecraft fiveS = new Spacecraft("2001 Mars Odyssey","2001_mars_odyssey.png","2001 Mars Odyssey is a robotic spacecraft orbiting the planet Mars. The project was developed by NASA, and contracted out to Lockheed Martin, with an expected cost for the entire mission of US$297 million. Its mission is to use spectrometers and a thermal imager to detect evidence of past or present water and ice, as well as study the planet's geology and radiation environment.[2] It is hoped that the data Odyssey obtains will help answer the question of whether life existed on Mars and create a risk-assessment of the radiation that future astronauts on Mars might experience. It also acts as a relay for communications between the Curiosity rover, and previously the Mars Exploration Rovers and Phoenix lander, to Earth. The mission was named as a tribute to Arthur C. Clarke, evoking the name of his and Stanley Kubrick's 1968 film 2001: A Space Odyssey.[3] ",
					"Mars Odyssey launched from Cape Canaveral on April 7, 2001, and arrived at Mars about 200 days later on October 24. The spacecraft's main engine fired in order to decelerate, which allowed it to be captured into orbit around Mars. Odyssey then spent about three months aerobraking, using aerodynamic drag from the upper reaches of the Martian atmosphere to gradually slow down and reduce and circularize its orbit. By using the atmosphere of Mars to slow the spacecraft in its orbit rather than firing its engine or thrusters, Odyssey was able to save more than 200 kilograms (440 lb) of propellant. This reduction in spacecraft weight allowed the mission to be launched on a Delta II 7925 launch vehicle, rather than a larger, more expensive launcher.[13]\n"
					+ " \n"
					+ " 			Aerobraking ended in January 2002, and Odyssey began its science mapping mission on February 19, 2002. Odyssey's original, nominal mission lasted until August 2004, but repeated mission extensions have kept the mission active.[14]\n"
					+ " \n"
					+ " 			About 85% of images and other data from NASA's twin Mars Exploration Rovers, Spirit and Opportunity, have reached Earth via communications relay by Odyssey. The orbiter helped analyze potential landing sites for the rovers and performed the same task for NASA's Phoenix mission, which landed on Mars in May 2008. Odyssey aided NASA's Mars Reconnaissance Orbiter, which reached Mars in March 2006, by monitoring atmospheric conditions during months when the newly arrived orbiter used aerobraking to alter its orbit into the desired shape.[15]\n"
					+ " \n"
					+ " 			Odyssey is in a Sun-synchronous orbit, which provides consistent lighting for its photographs. On September 30, 2008 (sol 2465) the spacecraft altered its orbit to gain better sensitivity for its infrared mapping of Martian minerals. The new orbit eliminated the use of the gamma ray detector, due to the potential for overheating the instrument at the new orbit.\n"
					+ " 			MARIE hardware, designed to measure radiation\n"
					+ " \n"
					+ " 			The payload's MARIE radiation experiment stopped taking measurements after a large solar event bombarded the Odyssey spacecraft on October 28, 2003. Engineers believe the most likely cause is that a computer chip was damaged by a solar particle smashing into the MARIE computer board. ",
					phase[0],"April 7 2001 15:02:22 UTC",7000,two,date,date);
			spacecraftRepository.save(fiveS);
			
			Spacecraft sixS = new Spacecraft("Mars Reconnaissance Orbiter","mars_reconnaissance_orbiter_spacecraft.png","Mars Reconnaissance Orbiter (MRO) is a spacecraft designed to study the geology and climate of Mars, provide reconnaissance of future landing sites, and relay data from surface missions back to Earth. It was launched on August 12, 2005 and reached Mars on March 10, 2006. In November 2006, after five months of aerobraking, it entered its final science orbit and began its primary science phase.[2] The cost to develop and operate MRO through the end of its prime mission in 2010 was US$716.6 million.[3]",
					"On August 12, 2005, MRO was launched aboard an Atlas V-401 rocket from Space Launch Complex 41 at Cape Canaveral Air Force Station.[9] The Centaur upper stage of the rocket completed its burns over a fifty-six-minute period and placed MRO into an interplanetary transfer orbit towards Mars.[10]\n"
					+ " \n"
					+ " 			MRO cruised through interplanetary space for seven and a half months before reaching Mars. While en route most of the scientific instruments and experiments were tested and calibrated. To ensure proper orbital insertion upon reaching Mars, four trajectory correction maneuvers were planned and a fifth emergency maneuver was discussed.[11] However, only three trajectory correction maneuvers were necessary, which saved 60 pounds (27 kg) of fuel that would be usable during MRO's extended mission.[12]\n"
					+ " 			Animation of Mars Reconnaissance Orbiter's trajectory around Mars from March 10, 2006 to September 30, 2007\n"
					+ " 			   Mars Reconnaissance Orbiter ·   Mars\n"
					+ " \n"
					+ " 			MRO began orbital insertion by approaching Mars on March 10, 2006, and passing above its southern hemisphere at an altitude of 370–400 kilometers (230–250 mi). All six of MRO's main engines burned for 27 minutes to slow the probe from 2,900 to 1,900 meters per second (9,500 to 6,200 ft/s). The helium pressurization tank was colder than expected, which reduced the pressure in the fuel tank by about 21 kilopascals (3.0 psi). The reduced pressure caused the engine thrust to be diminished by 2%, but MRO automatically compensated by extending the burn time by 33 seconds.[13]\n"
					+ " \n"
					+ " 			Completion of the orbital insertion placed the orbiter in a highly elliptical polar orbit with a period of approximately 35.5 hours.[14] Shortly after insertion, the periapsis – the point in the orbit closest to Mars – was 426 km (265 mi) from the surface[14] (3,806 km (2,365 mi) from the planet's center). The apoapsis – the point in the orbit farthest from Mars – was 44,500 km (27,700 mi) from the surface (47,972 km (29,808 mi) from the planet's center).\n"
					+ " \n"
					+ " 			When MRO entered orbit, it joined five other active spacecraft that were either in orbit or on the planet's surface: Mars Global Surveyor, Mars Express, 2001 Mars Odyssey, and the two Mars Exploration Rovers (Spirit and Opportunity). This set a new record for the most operational spacecraft in the immediate vicinity of Mars. Mars Global Surveyor and the rovers Spirit and Opportunity have since ceased to function. As of April 20, 2020, 2001 Mars Odyssey, Mars Express and MRO remain operational and have been joined by Mars Orbiter Mission, MAVEN and ExoMars Trace Gas Orbiter in orbit, and Curiosity and InSight on the surface, raising the record to eight active spacecraft.\n"
					+ " 			Artwork of MRO aerobraking\n"
					+ " \n"
					+ " 			On March 30, 2006, MRO began the process of aerobraking, a three-step procedure that cuts in half the fuel needed to achieve a lower, more circular orbit with a shorter period. First, during its first five orbits of the planet (one Earth week), MRO used its thrusters to drop the periapsis of its orbit into aerobraking altitude. This altitude depends on the thickness of the atmosphere because Martian atmospheric density changes with its seasons. Second, while using its thrusters to make minor corrections to its periapsis altitude, MRO maintained aerobraking altitude for 445 planetary orbits (about five Earth months) to reduce the apoapsis of the orbit to 450 kilometers (280 mi). This was done in such a way so as to not heat the spacecraft too much, but also dip enough into the atmosphere to slow the spacecraft down. After the process was complete, MRO used its thrusters to move its periapsis out of the edge of the Martian atmosphere on August 30, 2006.[15][16]",
					phase[0],"August 12 2005 11:43:00 UTC",5500,three,date,date);
			spacecraftRepository.save(sixS);
			
			Spacecraft sevenS = new Spacecraft("Juno","juno.png","Juno is a NASA space probe orbiting the planet Jupiter. It was built by Lockheed Martin and is operated by NASA's Jet Propulsion Laboratory. The spacecraft was launched from Cape Canaveral Air Force Station on August 5, 2011 (UTC), as part of the New Frontiers program.[6] Juno entered a polar orbit of Jupiter on July 5, 2016 (UTC; July 4 U.S. time),[4][7] to begin a scientific investigation of the planet.[8] After completing its mission, Juno will be intentionally deorbited into Jupiter's atmosphere.[8] ",
					"Juno was selected on June 9, 2005, as the next New Frontiers mission after New Horizons.[16] The desire for a Jupiter probe was strong in the years prior to this, but there had not been any approved missions.[17][18] The Discovery Program had passed over the somewhat similar but more limited Interior Structure and Internal Dynamical Evolution of Jupiter (INSIDE Jupiter) proposal,[18] and the turn-of-the-century era Europa Orbiter was canceled in 2002.[17] The flagship-level Europa Jupiter System Mission was in the works in the early 2000s, but funding issues resulted in it evolving into ESA's Jupiter Icy Moons Explorer.[19]\n"
					+ " \n"
					+ " 			Juno completed a five-year cruise to Jupiter, arriving on July 5, 2016.[7] The spacecraft traveled a total distance of roughly 2.8 billion kilometers (18.7 astronomical units; 1.74 billion miles) to reach Jupiter.[20] The spacecraft was designed to orbit Jupiter 37 times over the course of its mission. This was originally planned to take 20 months.[4][5] Juno's trajectory used a gravity assist speed boost from Earth, accomplished by an Earth flyby in October 2013, two years after its launch on August 5, 2011.[21] The spacecraft performed an orbit insertion burn to slow it enough to allow capture. It was expected to make three 53-day orbits before performing another burn on December 11, 2016, that would bring it into a 14-day polar orbit called the Science Orbit. Because of a suspected problem in Juno's main engine, the burn of December 11 was canceled, and Juno will remain in its 53-day orbit for its remaining orbits of Jupiter.[22]\n"
					+ " \n"
					+ " 			During the science mission, infrared and microwave instruments will measure the thermal radiation emanating from deep within Jupiter's atmosphere. These observations will complement previous studies of its composition by assessing the abundance and distribution of water, and therefore oxygen. This data will provide insight into Jupiter's origins. Juno will also investigate the convection that drives natural circulation patterns in Jupiter's atmosphere. Other instruments aboard Juno will gather data about its gravitational field and polar magnetosphere. The Juno mission was planned to conclude in February 2018, after completing 37 orbits of Jupiter. The probe was then intended to be de-orbited and burn up in Jupiter's outer atmosphere,[4][5] to avoid any possibility of impact and biological contamination of one of its moons.[23] ",
					phase[1],"August 5 2011 16:25 UTC",3287,two,date,date);
			spacecraftRepository.save(sevenS);
			
			Spacecraft eightS = new Spacecraft("Appolo 16","appolo16.png","Apollo 16 was the tenth crewed mission in the United States Apollo space program, the fifth and penultimate to land on the Moon, and the second to land in the lunar highlands.[2] The second of Apollo's \"J missions,\" it was crewed by Commander John Young, Lunar Module Pilot Charles Duke and Command Module Pilot Ken Mattingly. Launched from the Kennedy Space Center in Florida at 12:54 PM EST on April 16, 1972, the mission lasted 11 days, 1 hour, and 51 minutes, and concluded at 2:45 p.m. EST on April 27.[3][4][5]",
					"Young and Duke spent 71 hours—just under three days—on the lunar surface, during which they conducted three extra-vehicular activities or moonwalks, totaling 20 hours and 14 minutes. The pair drove the Lunar Roving Vehicle (LRV), the second produced and used on the Moon, for 26.7 kilometers (16.6 mi). On the surface, Young and Duke collected 95.8 kilograms (211 lb) of lunar samples for return to Earth, while Command Module Pilot Ken Mattingly orbited in the command and service module (CSM) above to perform observations. Mattingly, staying with the command module, spent 126 hours and 64 revolutions in lunar orbit.[6] After Young and Duke rejoined Mattingly in lunar orbit, the crew released a subsatellite from the service module (SM). During the return trip to Earth, Mattingly performed a one-hour spacewalk to retrieve several film cassettes from the exterior of the service module.[3][4]\n"
					+ " \n"
					+ " 			Apollo 16's landing spot in the highlands was chosen to allow the astronauts to gather geologically older lunar material than the samples obtained in three of the first four Moon landings, which were in or near lunar maria (Apollo 14 landed in the Fra Mauro Highlands). Samples from the Descartes Formation and the Cayley Formation disproved a hypothesis that the formations were volcanic in origin.[7]",
					phase[1],"April 16 1972 17:54:00 UTC",11,four,date,date);
			spacecraftRepository.save(eightS);
			
			Spacecraft nineS = new Spacecraft("Spirit","spirit.jpg","Spirit, also known as MER-A (Mars Exploration Rover – A) or MER-2, is a robotic rover on Mars, active from 2004 to 2010.[2] It was one of two rovers of NASA's Mars Exploration Rover Mission. It landed successfully within the impact crater Gusev on Mars at 04:35 Ground UTC on January 4, 2004, three weeks before its twin, Opportunity (MER-B), which landed on the other side of the planet. Its name was chosen through a NASA-sponsored student essay competition. The rover became stuck in a \"sand trap\" in late 2009 at an angle that hampered recharging of its batteries; its last communication with Earth was sent on March 22, 2010.",
					"The rover completed its planned 90-sol mission. Aided by cleaning events that resulted in more energy from its solar panels, Spirit went on to function effectively over twenty times longer than NASA planners expected. Spirit also logged 7.73 km (4.8 mi) of driving instead of the planned 600 m (0.4 mi),[6] allowing more extensive geological analysis of Martian rocks and planetary surface features. Initial scientific results from the first phase of the mission (the 90-sol prime mission) were published in a special issue of the journal Science.[7]\n"
					+ " \n"
					+ " 			On May 1, 2009 (5 years, 3 months, 27 Earth days after landing; 21.6 times the planned mission duration), Spirit became stuck in soft sand.[8] This was not the first of the mission's \"embedding events\" and for the following eight months NASA carefully analyzed the situation, running Earth-based theoretical and practical simulations, and finally programming the rover to make extrication drives in an attempt to free itself. These efforts continued until January 26, 2010 when NASA officials announced that the rover was likely irrecoverably obstructed by its location in soft sand,[9] though it continued to perform scientific research from its current location.[10]\n"
					+ " \n"
					+ " 			The rover continued in a stationary science platform role until communication with Spirit stopped on March 22, 2010 (sol 2208).[11][12] JPL continued to attempt to regain contact until May 24, 2011, when NASA announced that efforts to communicate with the unresponsive rover had ended, calling the mission complete.[13][14][15][16] A formal farewell took place at NASA headquarters shortly thereafter.\n"
					+ " \n"
					+ " 			The Jet Propulsion Laboratory (JPL), a division of the California Institute of Technology in Pasadena, manages the Mars Exploration Rover project for NASA's Office of Space Science, Washington. ",
					phase[1],"June 10 2003 1:58:47 p.m. EDT[2][3]",92,four,date,date);
			spacecraftRepository.save(nineS);
			
			Spacecraft tenS = new Spacecraft("Beagle 2","beagle2.jpg","The Beagle 2 is an inoperative British Mars lander that was transported by the European Space Agency's 2003 Mars Express mission. It was intended for an astrobiology mission that would have looked for past life on, and down to 1.5 metres under, the surface of Mars.",
					"The spacecraft was successfully deployed from the Mars Express on 19 December 2003 and was scheduled to land on the surface of Mars on 25 December; however, no contact was received at the expected time of landing on Mars. ESA declared the mission lost in February 2004, after numerous attempts to contact the spacecraft were made.[4]\n"
					+ " \n"
					+ " 			The Beagle 2's fate remained a mystery until January 2015 when it was located on the surface of Mars in a series of images from NASA's Mars Reconnaissance Orbiter HiRISE camera.[5][6] The images suggest that it landed safely, but two of the spacecraft's four solar panels failed to deploy, blocking the spacecraft's communications antenna.\n"
					+ " \n"
					+ " 			The Beagle 2 is named after HMS Beagle, the ship used by Charles Darwin.\n"
					+ " \n"
					+ " 			The Beagle 2 was conceived by a group of British academics headed by Professor Colin Pillinger of the Open University, in collaboration with the University of Leicester. The project was designed and developed by several UK academics and companies.[7] Its purpose was to search for signs of life on Mars, past or present,[8] and its name reflected this goal, as Pillinger explained:\n"
					+ " \n"
					+ " 		    \"HMS Beagle was the ship that took Darwin on his voyage around the world in the 1830s and led to our knowledge about life on Earth making a real quantum leap. We hope Beagle 2 will do the same thing for life on Mars.\"\n"
					+ " \n"
					+ " 			Isidis Planitia, an enormous flat sedimentary basin that overlies the boundary between the ancient highlands and the northern plains of Mars, was chosen as the landing site and a 50 by 8 kilometres (31.1 by 5.0 mi) ellipse centered on 11.53°N 90.50°E was selected.[8] The lander was expected to operate for about 180 days and an extended mission of up to one Martian year (687 Earth days) was thought possible. The Beagle 2 lander objectives were to characterise the landing site geology, mineralogy, geochemistry and oxidation state, the physical properties of the atmosphere and surface layers, collect data on Martian meteorology, climate, and search for biosignatures.",
					phase[1],"2 June 2003 07:45 UTC",180,five,date,date);
			spacecraftRepository.save(tenS);
			
			Spacecraft elevenS = new Spacecraft("Rosalind Franklin","rosalind_franklin.jpg","Rosalind Franklin,[5] previously known as the ExoMars rover, is a planned robotic Mars rover, part of the international ExoMars programme led by the European Space Agency and the Russian Roscosmos State Corporation.[6][7] The mission was scheduled to launch in July 2020,[8] but was postponed to 2022.[9]",
					"The plan calls for a Russian launch vehicle, an ESA carrier model, and a Russian lander named Kazachok,[10] that will deploy the rover to Mars' surface.[11] Once it has safely landed, the solar powered rover will begin a seven-month (218-sol) mission to search for the existence of past life on Mars. The Trace Gas Orbiter (TGO), launched in 2016, will operate as the data-relay satellite of Rosalind Franklin and the lander.[12]\n"
					+ " \n"
					+ " 			The rover is named after Rosalind Franklin, an English chemist and DNA pioneer. \n"
					+ " \n"
					+ " 			The ExoMars mission requires the rover to be capable of driving across the Martian terrain at 70 m (230 ft) per sol (Martian day) to enable it to meet its science objectives.[28][29] The rover is designed to operate for at least seven months and drive 4 km (2.5 mi), after landing.[18]\n"
					+ " \n"
					+ " 			Since the rover communicates with the ground controllers via the ExoMars Trace Gas Orbiter (TGO), and the orbiter only passes over the rover approximately twice per sol, the ground controllers will not be able to actively guide the rover across the surface. The Rosalind Franklin rover is therefore designed to navigate autonomously across the Martian surface.[30][31] Two stereo camera pairs (NavCam and LocCam) allow the rover to build up a 3D map of the terrain,[32] which the navigation software then uses to assess the terrain around the rover so that it avoids obstacles and finds an efficient route to the ground controller specified destination.\n"
					+ " \n"
					+ " 			On 27 March 2014, a \"Mars Yard\" was opened at Airbus Defence and Space in Stevenage, UK, to facilitate the development and testing of the rover's autonomous navigation system. The yard is 30 by 13 m (98 by 43 ft) and contains 300 tonnes (330 short tons; 300 long tons) of sand and rocks designed to mimic the terrain of the Martian environment.[33][34] ",
					phase[1],"20 September 2022[3]",0,five,date,date);
			spacecraftRepository.save(elevenS);
		}
	
		
	}

}
