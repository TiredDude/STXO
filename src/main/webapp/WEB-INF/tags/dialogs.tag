<%@ tag language="java" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<div class="dialogs-wrapper">
	<div class="dialog" id="new-game-dialog">
		<div class="container dialog-block">
			<form class="block-inner-small" method="post" action="game">
				<div class="block container-inner ">
					<div class="dialog-block-row">
						<span class="dialog-block-row-title-block">GAME NAME</span> 
						<input type="text"	name="name" id="game-name" required="required" title="Input your login here">
					</div>
					<div class="dialog-block-row">
						<span class="dialog-block-row-title-inline">ROUNS</span> 
						<input type="number"	name="rounds" id="game-rounds" required="required" title="Input number of rounds">
					</div>
					<div class="dialog-block-row">
						<input type="button" name="dialog-button" value="Cancel" class="big-blue-button" id="close-dialog-button">
						<input type="submit" name="dialog-button" value="Start"	class="big-blue-button" id="new-game-submit">
					</div>
				</div>
			</form>
		</div>
	</div>
</div>