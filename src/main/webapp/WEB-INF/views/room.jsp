<%@ page language="java" contentType="text/html; charset=Utf8"
	pageEncoding="Utf8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<tag:head title="Game" />
	<div class="user-login-bar">
		<span class="user-login-bar-title">Login</span>
	</div>
	<div class="user-action-bar">
		<span class="user-action-sound" > 80% </span>
		<div id="audioSlider"></div>
	</div>
	<div class="container main-container">
			<div class="games-list block">
				<div class="block-inner">
					<div class="tabs-title-block">
						<span class="tab-title tab-title-active tab-title-left" id="games-tab-triger"> [  Games  ]</span>
						<span class="tab-title tab-title-disable tab-title-right" id="history-tab-triger">History</span>
					</div>
					<div class="games-tab">
						<div class="games-list-content">
							<div class="games-list-content-item list-content-item">
								<span class="list-item-text">Game name</span>
								<span class="list-item-text">game status</span>
								<span class="list-item-text">rounds</span>
							</div>
							<div class="games-list-content-item list-content-item">
								<span class="list-item-text">Game name</span>
								<span class="list-item-text">game status</span>
								<span class="list-item-text">rounds</span>
							</div>
							<div class="games-list-content-item list-content-item">
								<span class="list-item-text">Game name</span>
								<span class="list-item-text">game status</span>
								<span class="list-item-text">rounds</span>
							</div>
							<div class="games-list-content-item list-content-item">
								<span class="list-item-text">Game name</span>
								<span class="list-item-text">game status</span>
								<span class="list-item-text">rounds</span>
							</div>
							<div class="games-list-content-item list-content-item">
								<span class="list-item-text">Game name</span>
								<span class="list-item-text">game status</span>
								<span class="list-item-text">rounds</span>
							</div>
							<div class="games-list-content-item list-content-item">
								<span class="list-item-text">Game name</span>
								<span class="list-item-text">game status</span>
								<span class="list-item-text">rounds</span>
							</div>
						</div>
						<div class="games-list-control-panel">
							<input type="button" value="Create game" class="big-blue-button" id="create-game-button">
							<input type="button" value="Join game" class="big-blue-button" id="join-game-button">
						</div>
					</div>
					<div class="history-tab" >
						<div class="games-list-content">
							<div class="games-list-content-item list-content-item">
								<span class="list-item-text">Game name</span>
								<span class="list-item-text">Opponent</span>
								<span class="list-item-text">result</span>
							</div>
							<div class="games-list-content-item list-content-item">
								<span class="list-item-text">Game name</span>
								<span class="list-item-text">Opponent</span>
								<span class="list-item-text">result</span>
							</div>
						</div>
						<div class="games-list-control-panel">
							<input type="button" value="Clear history" class="big-blue-button" id="history-clear-utton">
						</div>
					</div>
				</div>
			</div>
			<div class="game-chat block">
				<div class="block-separeator-left"></div>
				
				<div class="block-inner">
					<div class="tabs-title-block">
						<span class="time-title">00:00:01</span>
					</div>
					<div class="game-chat-content">
						<div class="game-chat-content-message">
							<span>Darth_Vader</span>
							<span>: Luck I'm your father...</span>
						</div>
						<div class="game-chat-content-message">
							<span>Luck_Skywalker</span>
							<span>: T_T NOOO!!!</span>
						</div>
					</div>
					<textarea class="message-textarea"></textarea>
					<input type="button" value="Send" class="big-blue-button message-send-button">
				</div>
				
				<div class="block-separeator-right"></div>
			</div>
			<div class="players-list block">
			<div class="block-inner">
				<div class="tabs-title-block">
					<span class="tab-title tab-title-active tab-title-left" id="players-tab-triger"> [  Players  ]</span>
					<span class="tab-title tab-title-disable tab-title-right" id="top-tab-triger">Top 10</span>
				</div>
				<div class="players-tab" >
					<div class="players-list-content">
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">win/lose</span>
							<span class="list-item-text">players status</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">win/lose</span>
							<span class="list-item-text">players status</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">win/lose</span>
							<span class="list-item-text">players status</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">win/lose</span>
							<span class="list-item-text">players status</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">win/lose</span>
							<span class="list-item-text">players status</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">win/lose</span>
							<span class="list-item-text">players status</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">win/lose</span>
							<span class="list-item-text">players status</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">win/lose</span>
							<span class="list-item-text">players status</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">win/lose</span>
							<span class="list-item-text">players status</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">win/lose</span>
							<span class="list-item-text">players status</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">win/lose</span>
							<span class="list-item-text">players status</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">win/lose</span>
							<span class="list-item-text">players status</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">win/lose</span>
							<span class="list-item-text">players status</span>
						</div>
					</div>
					<div class="players-list-control-panel">
						<input type="button" value="Duel" class="big-blue-button" id="duel-button">
						<input type="button" value="Ignore" class="big-blue-button" id="ignore-button">
					</div>
				</div>
				<div class="top-tab" >
					<div class="players-list-content">
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">-</span>
							<span class="list-item-text">win/lose</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">-</span>
							<span class="list-item-text">win/lose</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">-</span>
							<span class="list-item-text">win/lose</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">-</span>
							<span class="list-item-text">win/lose</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">-</span>
							<span class="list-item-text">win/lose</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">-</span>
							<span class="list-item-text">win/lose</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">-</span>
							<span class="list-item-text">win/lose</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">-</span>
							<span class="list-item-text">win/lose</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">-</span>
							<span class="list-item-text">win/lose</span>
						</div>
						<div class="players-list-content-item list-content-item">
							<span class="list-item-text">Player name</span>
							<span class="list-item-text">-</span>
							<span class="list-item-text">win/lose</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<tag:footer />
	<tag:dialogs />
</html>