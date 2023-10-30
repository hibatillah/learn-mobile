package com.example.latihanmoviekatalog

class DataMovie {
    companion object {
        fun setData(): ArrayList<MovieObj> {
            val list = ArrayList<MovieObj>()

            list.add(
                MovieObj(
                    "https://th.bing.com/th/id/OIP._6dP2n8MhINzZ9FFTgKTzwHaK-?pid=ImgDet&rs=1",
                    "Avengers: Endgame",
                    "8.4",
                    "Robert Downey Jr, Chris Evans, Chris Hemsworth",
                    "2 jam 40 menit",
                    "Action, Adventure, Drama",
                    "English",
                    "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
                )
            )
            list.add(
                MovieObj(
                    "https://th.bing.com/th/id/OIP.ZkOmuqOWNqKDYkMKe2YeAgHaK-?pid=ImgDet&rs=1",
                    "Avengers: Infinity War",
                    "8.4",
                    "Robert Downey Jr, Chris Evans, Chris Hemsworth",
                    "2 jam 30 menit",
                    "Action, Adventure, Sci-Fi",
                    "English",
                    "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe.",
                )
            )
            list.add(
                MovieObj(
                    "https://th.bing.com/th/id/OIP.5V2RWsz9vRyrGWDyOSYNYgHaK-?pid=ImgDet&rs=1",
                    "Spiderman: No Way Home",
                    "8.2",
                    "Tom Holland, Andrew Garfield, Tobbey Maguire",
                    "2 jam 28 menit",
                    "Action, Adventure, Fantasy",
                    "English",
                    "With Spider-Man's identity now revealed, Peter asks Doctor Strange for help. When a spell goes wrong, dangerous foes from other worlds start to appear, forcing Peter to discover what it truly means to be Spider-Man.",
                )
            )
            list.add(
                MovieObj(

                    "https://th.bing.com/th/id/OIP._6dP2n8MhINzZ9FFTgKTzwHaK-?pid=ImgDet&rs=1",
                    "The Engineer",
                    "3.8",
                    "Emile Hirisch",
                    "1 jam 32 menit",
                    "Petualangan",
                    "English",
                    "Follows the biggest manhunt in the history of Israel to find Yahya Ayyash, " +
                            "the mastermind bombmaker who oversaw a group of suicide troops in Israel in the middle of the 1990s.",
                )
            )
            list.add(
                MovieObj(
                    "https://th.bing.com/th/id/OIP.ZkOmuqOWNqKDYkMKe2YeAgHaK-?pid=ImgDet&rs=1",
                    "Inside Man","5.5",
                    "Lucy Hale",
                    "1 j 27 m",
                    "Drama, Cerita seru ",
                    "English",
                    "Based on true events, Inside Man follows disgraced New York Police Detective Bobby Belucci (Emile Hirsch) as his life falls apart when he discovers his wife (Ashley Greene) is having an affair. After beating her lover to a pulp, she leaves him and Bobby gets demoted at work, triggering his determination to prove he's worthy of redemption." +
                            " His plan is to go undercover as a grunt and infiltrate the Gambino crime family's notorious \"DeMeo Crew,\" a violent and bloody faction that reigned terror in the 1960s and '70s. Bobby will stop at nothing to get close to the head of the crew, Roy DeMeo (Danny Abeckaser), to expose the murder and corruption. But as Bobby sinks deeper into the mob and more bodies drop, the price for absolution may be higher than he can afford.",

                    )
            )
            list.add(
                MovieObj(
                    "https://th.bing.com/th/id/OIP.5V2RWsz9vRyrGWDyOSYNYgHaK-?pid=ImgDet&rs=1",
                    "Desperation Road",
                    "5.7",
                    "Mel Gibson",
                    "1j 33m",
                    "Action",
                    "English",
                    "A Southern Noir thriller, set in a tough-and-tumble Mississippi town where a woman and her young daughter are caught " +
                            "in the crossfire when whiskey, guns, and the desire for revenge violently intersect.",
                )
            )
            return list
        }
    }
}