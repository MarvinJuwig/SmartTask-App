package com.example.smarttask.home

import com.example.smarttask.screens.home.HomeViewModel
import io.mockk.unmockkAll
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.koin.test.KoinTest

class HomeViewModelTest : KoinTest {

    //@get:Rule
    //val koinTestRule = KoinTestUtilities.koinTestRule
    //Die Rules müssten selbst geschrieben werden.
    // Z.b. wie in SmartControl um context.getString() zu mokken. Die variabel wird dann zwar nirgends verwendet,
    // trotzdem wird der Rule Code dann vorher ausgeführt und muss nicht händisch in jedem Test erneut geschrieben werden

    private val mainDispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(mainDispatcher)
    }

    @After
    fun teardown() {
        Dispatchers.resetMain()
        unmockkAll()
    }

    lateinit var sut: HomeViewModel

    private fun initSut() {
        sut = HomeViewModel()
    }

    @Test
    fun test() = runTest {
        // GIVEN
        //every { }
        //coEvery { }

        initSut()

        // WHEN
        //val result = sut.

        // THEN
        /*assertEquals(0,1)
        coVerify {}
        verify {}*/
    }
}